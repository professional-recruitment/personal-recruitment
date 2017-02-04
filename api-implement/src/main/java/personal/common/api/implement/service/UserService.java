package personal.common.api.implement.service;

import org.springframework.stereotype.Service;

/**
 * 用户服务
 *
 * @author anyone
 * @since 1.0.0
 */
@Service
public class UserService {

    public boolean login(String username, String password) {
        // TODO
        return username.equals(password);
    }
}
