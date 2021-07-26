package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: BlueSky
 * @create: 2021-07-16 17:40
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9003
{
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9003.class, args);
	}
}
