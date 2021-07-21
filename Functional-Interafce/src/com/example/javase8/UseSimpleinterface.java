package com.example.javase8;

import com.example.javase8.interfaces.SimpleInterface;

public class UseSimpleinterface {

	public static void main(String[] args) {
//		SimpleInterface simpleInterface = new SimpleInterface() {
//			@Override
//			public void doSomething() {
//				System.out.println("Hello World - Annoymous Inner Class");
//				
//			}
//		};
		
		SimpleInterface simpleInterface = ()-> System.out.println("Hello World - Lambda");
		simpleInterface.doSomething();
	}
}
