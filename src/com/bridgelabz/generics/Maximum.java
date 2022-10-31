package com.bridgelabz.generics;

public class Maximum {
	public < T extends Comparable<T>> void findMax(T n1 ,T n2,T n3 ) {
		if(n1.compareTo(n2)>=0 && n1.compareTo(n3)>=0) {
			System.out.println(n1+" is maximum number.");
		}
		else if(n2.compareTo(n1)>=0 && n2.compareTo(n3)>=0){
		System.out.println(n2+" is maximum");
		}
		else {
		System.out.println(n3 + " is maximum");
	}
	}

}
