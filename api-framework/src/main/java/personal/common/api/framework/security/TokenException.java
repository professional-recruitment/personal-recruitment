package personal.common.api.framework.security;

/**
 * 令牌异常
 *
 * @author huangyong
 * @since 1.0.0
 */
public class TokenException extends RuntimeException {

    public TokenException(String message) {
        super(message);
    }
}
