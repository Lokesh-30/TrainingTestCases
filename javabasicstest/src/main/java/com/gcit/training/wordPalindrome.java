package com.gcit.training;

public class wordPalindrome {

	public boolean wordP(String word) {
		char [] a = word.toCharArray();
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
