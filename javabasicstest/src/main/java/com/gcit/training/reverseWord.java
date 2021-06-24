package com.gcit.training;

public class reverseWord {

	public String reverseW(String word) {
    word = word.trim();
	String result = ""; 
	char[] ch=word.toCharArray();  
	for (int i = ch.length - 1; i >= 0; i--) {
		result += ch[i];
	}
	return result;

	}

}
