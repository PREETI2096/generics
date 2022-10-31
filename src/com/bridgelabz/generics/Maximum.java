package com.bridgelabz.generics;

public class Maximum {
	public void findMax(String x , String y , String  z) {
		if(x.compareTo(y)>=0 && x.compareTo(z)>=0) {
			System.out.println(x+" is maximum number.");
		}
		else if(y.compareTo(x)>=0 && y.compareTo(z)>=0){
		System.out.println(y+" is maximum");
		}
		else {
		System.out.println(z + " is maximum");
	}	
}


}
