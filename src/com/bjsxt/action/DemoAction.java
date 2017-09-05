package com.bjsxt.action;
/**
 * action实现的第三种方式：自定义类 返回值必须是 return "success";
 * @author:jwzhang
 * @date:2017年8月29日下午1:13:32
 */
public class DemoAction {

	public String demo(){
		System.out.println("demo");
		return "success";
	}
}
