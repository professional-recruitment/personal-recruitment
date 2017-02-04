package personal.common.api.implement.bean;

/**
 * 用户对象
 *
 * @author anyone
 * @since 1.0.0
 */
public class UserBean {

    private String token;
    private String username;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
