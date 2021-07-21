package com.example.java8.interfaces;

public interface PersonInterface {
	
	String getName();
	void  setName(String name);
	int getAge();
	void setAge(int age);
	
	//java se 8 default method
	default String getPersonInfo() {
		return getName() + "(" + getAge() +")";
	}

}
