package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class FeignConfig {

	@Bean
	Logger.Level feignLoggerLevel() {
		// 请求和响应的头信息,请求和响应的正文及元数据
		return Logger.Level.FULL;
	}

}