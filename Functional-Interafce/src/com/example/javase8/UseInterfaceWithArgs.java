package com.example.javase8;

import com.example.javase8.interfaces.InterfaceWithArgs;

public class UseInterfaceWithArgs {
	
	public static void main(String[] args) {
		
		InterfaceWithArgs sum = (x,y)->{
			int in_sum = x + y;
			System.out.println("the sum is : " + in_sum);
		};
		
		sum.calculate(10, 20);
		
		InterfaceWithArgs multiply = (x,y)->{
			int in_mul = x * y;
			System.out.println("the multile is : " + in_mul);
		};
		
		multiply.calculate(10, 20);
	}

}
