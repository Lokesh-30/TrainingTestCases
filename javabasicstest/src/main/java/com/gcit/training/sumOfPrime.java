package com.gcit.training;

public class sumOfPrime {

	public int sum(int n) {
	int sum =0;
	for(int i=2;i<=n;i++) {
		int count=0;
		for(int j=2;j<i;j++) {
			if(i%j == 0) {
				count++;
			}
		}
		if(count == 0) {
			sum+=i;
		}
	}
	return sum;
	}

}
