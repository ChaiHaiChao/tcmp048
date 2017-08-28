package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	//每次访问action的时候,都会默认执行execute方法
	public String execute(){
		System.out.println("hello world");
		return NONE;
	}
}
