package com.primitive;

import java.util.Scanner;

public class JavaExam1Question5 {

	
	public static void main(String[]args){
		
		Scanner mpp = new Scanner(System.in);
		
		System.out.print(" Please Enter your age here  number: ");
		int age = mpp.nextInt();
		if (age >= 21 && age <= 35){
			System.out.println(" You are young ");
		}else if ( age >=36 && age <=50){
		System.out.println(" You are not that old");
		}else {
			System.out.println(" You are Senior Citizen");
		}
		mpp.close();
	}
}
