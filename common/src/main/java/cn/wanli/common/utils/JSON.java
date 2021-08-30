package cn.wanli.common.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * json工具类
 *
 * @author wanli
 */
public final class JSON {

    private JSON() {
        throw new AssertionError("工具类不能实例化");
    }

    private static final Logger logger = LoggerFactory.getLogger(JSON.class);
    public static final ObjectMapper MAPPER;

    static {
        MAPPER = new ObjectMapper();
        MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        JavaTimeModule module = new JavaTimeModule();
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(DateUtils.DATE_TIME_FORMATTER));
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(DateUtils.DATE_TIME_FORMATTER));
        MAPPER.registerModule(module);

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        MAPPER.setDateFormat(format);

    }

    /**
     * Method that can be used to serialize any Java value as
     * a String.
     *
     * @param obj
     * @return
     */
    public static String toJSONString(Object obj) {
        String s = null;
        try {
            s = MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.error("对象转JSON出现错误", e);
        }
        return s;
    }

    /**
     * Method to deserialize JSON content from given JSON content String.
     *
     * @param content
     * @param valueType
     * @param <T>
     * @return
     */
    public static <T> T parseObject(String content, Class<T> valueType) {
        T t = null;
        try {
            t = MAPPER.readValue(content, valueType);
        } catch (JsonProcessingException e) {
            logger.error("JSON转对象失败", e);
        }
        return t;
    }

    /**
     * Method to deserialize JSON content from given JSON content String.
     *
     * @param content
     * @param valueTypeRef
     * @param <T>
     * @return
     */
    public static <T> T parseObject(String content, TypeReference<T> valueTypeRef) {
        T t = null;
        try {
            t = MAPPER.readValue(content, valueTypeRef);
        } catch (JsonProcessingException e) {
            logger.error("JSON转对象失败", e);
        }
        return t;
    }
}
