package com.gcit.training.foreach;

public class ForEachEx {

	public int forEach() {
		int [] num = {1,2,3,4,5};
		int output = 0;
		for(int num1 : num) {
		 output += num1;	
		}
		return output;

	}

}
