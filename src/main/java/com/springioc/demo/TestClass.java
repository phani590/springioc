package com.springioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("spring-context.xml");
		System.out.println(context+"testing phani");
	}

}
