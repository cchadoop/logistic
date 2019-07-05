package com.jxlg.logistic;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.apache.shiro.util.AntPathMatcher;
import org.apache.shiro.util.PatternMatcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import com.jxlg.logistic.sys.entity.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogisticApplicationTests {
	
	@Resource
	private ValueOperations<String, Object> valueOperations;
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testMatch() {
		PatternMatcher patternMatcher = new AntPathMatcher();
		boolean flag = patternMatcher.matches("/admin/*", "/admin/123");
//		System.out.println(flag);
		assertEquals(flag, true);
		System.out.println("test github");
	}
	
	@Test
	public void testRedisTemplate() {
		valueOperations.set("test", "xxx");
		String r = valueOperations.get("test").toString();
		assertEquals(r, "xxx");
	}
	
	@Test
	public void testRedisTemplate2() {
		long startTime = System.currentTimeMillis();
		Employee employee = new Employee();
		employee.setEmpId("1");
		employee.setEmpName("张三");
		redisTemplate.opsForValue().set("employee", employee);
		Employee employeeOut = (Employee)redisTemplate.opsForValue().get("employee");
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		System.out.println(employeeOut);
	}

}
