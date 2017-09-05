package com.bjsxt.action;

import com.opensymphony.xwork2.Action;

/**
 * action实现的第一种方式：实现Action 接口
 * @author:jwzhang
 * @date:2017年8月29日下午12:56:29
 */
public class IndexAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("index首页！");
		// return SUCCESS:表示成功，并返回给客户端
		return SUCCESS;
	}

	
}
