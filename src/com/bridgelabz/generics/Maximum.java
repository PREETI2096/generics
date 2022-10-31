package com.bridgelabz.generics;

public class Maximum<T extends Comparable<T>> {
	
	T n1,n2,n3;
	

	public Maximum(T n1, T n2, T n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	public void testMaximum() { 
		testMaximum(n1, n2, n3);
	}

	static < T extends Comparable<T>> void testMaximum(T n1 ,T n2,T n3 ) {
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
