package com.gcit.training;

public class numberPalindrome {

	public boolean numP(int n) {
		char [] a = Integer.toString(n).toCharArray();
		boolean test = true;
		int l = a.length;
		for(int i=0;i<l/2;i++) {
			if(a[i]!=a[l-i-1]) {
				test = false;
			}
		}
		return test;
	}

}
