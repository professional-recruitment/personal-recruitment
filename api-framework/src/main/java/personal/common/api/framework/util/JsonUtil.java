package personal.common.api.framework.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Map;
import personal.common.api.framework.json.CustomObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JSON 工具类
 *
 * @author huangyong
 * @since 1.0.0
 */
public final class JsonUtil {

    private static ObjectMapper objectMapper = new CustomObjectMapper();

    /**
     * 将 POJO 对象转为 JSON 字符串
     */
    public static <T> String toJson(T pojo) {
        String json;
        try {
            json = objectMapper.writeValueAsString(pojo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return json;
    }

    /**
     * 将 JSON 字符串转为 POJO 对象
     */
    public static <T> T fromJson(String json, Class<T> type) {
        T pojo;
        try {
            pojo = objectMapper.readValue(json, type);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return pojo;
    }

    public static Map objectToMap(Object object) {
        Map map;
        try {
            String result = objectMapper.writeValueAsString(object);
            map = objectMapper.readValue(result, Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("json转换异常");
        } catch (IOException e) {
            throw new RuntimeException("json转换异常");
        }

        return map;
    }

    public static Map objectToMap(String object) {
        Map map;
        try {
            map = objectMapper.readValue(object, Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("json转换异常");
        } catch (IOException e) {
            throw new RuntimeException("json转换异常");
        }

        return map;
    }
}
