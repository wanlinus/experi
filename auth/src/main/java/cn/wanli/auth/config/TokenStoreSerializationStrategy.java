package cn.wanli.auth.config;

import cn.wanli.common.utils.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStoreSerializationStrategy;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author wanli
 */
public class TokenStoreSerializationStrategy implements RedisTokenStoreSerializationStrategy {

    private static boolean isEmpty(byte[] bytes) {
        return bytes == null || bytes.length == 0;
    }

    @Override
    public <T> T deserialize(byte[] bytes, Class<T> clazz) {
        if (isEmpty(bytes)) {
            return null;
        }
        try {
            return JSON.MAPPER.readValue(bytes, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String deserializeString(byte[] bytes) {
        if (isEmpty(bytes)) {
            return null;
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }

    @Override
    public byte[] serialize(Object object) {
        if (object == null) {
            return new byte[0];
        }

        try {
            return JSON.MAPPER.writeValueAsBytes(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    @Override
    public byte[] serialize(String data) {
        if (data == null) {
            return new byte[0];
        }
        return data.getBytes(StandardCharsets.UTF_8);
    }
}
