package com.springioc.demo.entity;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;  
	private String name;  
	private List<String> answers;  
	private List<Answer> otheranswers;  
	  
	public Question() {}  
	public Question(int id, String name, List<String> answers,List<Answer> otheranswers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	    this.otheranswers =otheranswers;
	}  
	  
	public String toString(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }
	    Iterator<Answer> itr2=otheranswers.iterator(); 
	    while(itr2.hasNext()){  
	        System.out.println(itr2.next());  
	    } 
	    return  id+" "+name;
	} 
}
