package personal.common.api.framework.jdbc;

/**
 * 服务运行异常
 *
 * @author anyone
 * @since 1.0.0
 */
public class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
    }
}
