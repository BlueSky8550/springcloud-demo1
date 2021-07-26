package com.atguigu.springcloud.alibaba;

/**
 * @description:
 * @author: BlueSky
 * @create: 2021-07-16 17:53
 **/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy
 * @create 2020-02-13 20:22
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain84
{
	public static void main(String[] args) {
		SpringApplication.run(OrderNacosMain84.class, args);
	}
}
