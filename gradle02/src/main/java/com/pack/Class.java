package com.pack;
public class Class{
	
	public static void main(String [] args){
		//Not handling any type related exceptions
		System.out.println(
			sum(
				Integer.parseInt(args[0]),
				Integer.parseInt(args[1])
				)
			);
	}
	public static int sum(int a, int b){
		return a+b;
	}
}