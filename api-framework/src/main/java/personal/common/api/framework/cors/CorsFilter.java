package personal.common.api.framework.cors;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 支持 CORS 跨域
 *
 * @author huangyong
 * @since 1.0.0
 */
public class CorsFilter implements Filter {

    private String allowOrigin;
    private String allowMethods;
    private String allowHeaders;
    private String exposeHeaders;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        allowOrigin = filterConfig.getInitParameter("allowOrigin");
        allowMethods = filterConfig.getInitParameter("allowMethods");
        allowHeaders = filterConfig.getInitParameter("allowHeaders");
        exposeHeaders = filterConfig.getInitParameter("exposeHeaders");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", allowOrigin);
        response.setHeader("Access-Control-Allow-Methods", allowMethods);
        response.setHeader("Access-Control-Allow-Headers", allowHeaders);
        response.setHeader("Access-Control-Expose-Headers", exposeHeaders);
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {
    }
}
