package personal.common.api.framework.jdbc.id;

import java.util.List;

/**
 * ID 生成器接口
 *
 * @author anyone
 * @since 1.0.0
 */
public interface IdGenerator {

    String generateId();

    List<String> generateIdList(int count);
}
