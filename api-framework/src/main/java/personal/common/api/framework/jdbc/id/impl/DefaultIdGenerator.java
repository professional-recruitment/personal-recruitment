package personal.common.api.framework.jdbc.id.impl;


import personal.common.api.framework.jdbc.id.IdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * ID 生成器接口默认实现
 *
 * @author anyone
 * @since 1.0.0
 */
public class DefaultIdGenerator implements IdGenerator {

    @Override
    public String generateId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    @Override
    public List<String> generateIdList(int count) {
        List<String> idList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            idList.add(generateId());
        }
        return idList;
    }
}
