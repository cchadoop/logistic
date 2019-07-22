package com.jxlg.logistic.utils;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class RedisUtil {
	@Resource
	private static RedisTemplate<String, Object> redisTemplate;

	public static void set(String key, Object value) {
		@SuppressWarnings("rawtypes")
		RedisSerializer serializer = new StringRedisSerializer();
		// 设置key编码方式
		redisTemplate.setKeySerializer(serializer);

		ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
		opsForValue.set(key, value);
	}

	public static Object get(String key) {
		ValueOperations<String, Object> opsForValue = redisTemplate.opsForValue();
		Object value = opsForValue.get(key);
		return value;
	}

}
