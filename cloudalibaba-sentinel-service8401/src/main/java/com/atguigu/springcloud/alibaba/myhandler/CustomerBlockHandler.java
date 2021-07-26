package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @description:
 * @author: BlueSky
 * @create: 2021-07-16 17:29
 **/
public class CustomerBlockHandler
{
	public static CommonResult handleException(BlockException exception){
		return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler");
	}

	public static CommonResult handleException2(BlockException exception){
		return new CommonResult(2021,"自定义的限流处理信息......CustomerBlockHandler");
	}
}
