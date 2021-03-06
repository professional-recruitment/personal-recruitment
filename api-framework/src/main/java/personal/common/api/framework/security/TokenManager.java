package personal.common.api.framework.security;

/**
 * 令牌管理器
 *
 * @author anyone
 * @since 1.0.0
 */
public interface TokenManager {

    String createToken(String username);

    boolean checkToken(String token);
}
