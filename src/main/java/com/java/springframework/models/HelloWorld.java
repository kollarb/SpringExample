package com.java.springframework.models;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloWorld {

	public void print(){
		System.out.println("Hello Spring World");
	}
}
