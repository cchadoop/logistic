package com.jxlg.logistic;

import static org.junit.Assert.assertEquals;
import org.apache.shiro.util.AntPathMatcher;
import org.apache.shiro.util.PatternMatcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogisticApplicationTests {

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

}
