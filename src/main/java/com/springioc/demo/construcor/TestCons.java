package com.springioc.demo.construcor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.demo.entity.Employee;
import com.springioc.demo.entity.Person;
import com.springioc.demo.entity.Question;

public class TestCons {

	public static void main(String[] args) {
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("spring-context.xml");
		testShow(context, "empCons1");
		testShow(context, "empCons2");
		testShow(context, "empCons3");
		
		Person person=(Person)context.getBean("person1");
		System.out.println(person);
		
		Person person2=(Person)context.getBean("person2");
		System.out.println(person2);
		
		testShow(context, "empCons4");
		Question question=(Question)context.getBean("question1");
		question.toString();

	}
	
	private static void testShow(ApplicationContext context, String beanName) {
		Employee s=(Employee)context.getBean(beanName);  
        s.show();  
	} 

}
