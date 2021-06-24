package com.gcit.training;

public class checkPower {

	public boolean check(int n) {
		while (n>4) {
			n = n/4;
		}
	if(n == 4) {
		return true;
	}
	else {
		return false;
	}

	}

}
