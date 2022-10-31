package com.bridgelabz.generics;

import java.util.Scanner;

public class MaximumMain {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			Maximum obj = new Maximum();
			
			System.out.println("Enter first number:");
			int n1 = sc.nextInt();
			System.out.println("Enter second number:");
			int n2 = sc.nextInt();
			System.out.println("Enter third number:");
			int n3 = sc.nextInt();
			sc.close();
			
			obj.findMax(n1, n2, n3);
			
		}

	}


