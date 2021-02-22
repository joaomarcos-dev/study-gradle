package com.pack;

import org.apache.commons.lang3.StringUtils;

public class Class{
	
	public static void main(String [] args){

		if(args.length == 0){
			String response = "No  augend or addend";
			System.out.println(StringUtils.capitalize(response));
			return;
		}
		
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