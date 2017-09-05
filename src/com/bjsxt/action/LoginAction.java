package com.bjsxt.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * action实现的第二种方式：继承ActionSupport
 * @author:jwzhang
 * @date:2017年8月29日下午1:06:08
 */
public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String login() {
		System.out.println("login！登录界面");
		return SUCCESS;
	}
}
