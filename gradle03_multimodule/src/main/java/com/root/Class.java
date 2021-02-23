package com.root;

import com.package01.Square;
import com.package02.Cube;

public class Class{
	//Not handling any exceptions
	public static void main(String [] args){
		
		double inputNumber = Double.valueOf(args[0]).doubleValue();
		
		System.out.println("The square is:" + Square.squared(inputNumber));
		System.out.println("The cube is:" + Cube.cubed(inputNumber));
	}
}