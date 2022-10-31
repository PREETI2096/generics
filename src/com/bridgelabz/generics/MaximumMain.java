package com.bridgelabz.generics;


public class MaximumMain {

	public static void main(String[] args) {
		
			Maximum<Integer> obj1 = new Maximum<Integer>(25,18,36);
			obj1.testMaximum();
			Maximum<Float> obj2 = new Maximum<Float>(2.6f, 6.2f, 4.7f);
			obj2.testMaximum();
			Maximum<String> obj3 = new Maximum<String>("Apple","Orange","Grapes");
			obj3.testMaximum();
			
		}
	}


