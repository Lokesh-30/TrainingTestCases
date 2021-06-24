package com.gcit.training;

public class ArrayLength{

  public static int[] exampleVariableOne = new int[5];
  public static int[] exampleVariableTwo = {0, 1, 2, 3, 4, 5, 6, 7, 8};


public int arrayLength1() {
	int[] actual = new int[5];
	 int lengthOne = actual.length;
    return lengthOne ;
    
  
}
public int arrayLength2() {
	int[] exampleVariableTwo = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	int lengthTwo = exampleVariableTwo.length;
    return lengthTwo;
}
}