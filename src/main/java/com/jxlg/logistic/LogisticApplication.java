package com.jxlg.logistic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.jxlg.logistic.module.*.mapper")
@EnableCaching
public class LogisticApplication {

	public static void main(String[] args) {
		//处理redis与elasticsearch并存问题
		System.setProperty("es.set.netty.runtime.available.processors", "false");
		SpringApplication.run(LogisticApplication.class, args);
	}

}
