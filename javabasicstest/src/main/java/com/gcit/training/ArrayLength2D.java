package com.gcit.training;

public class ArrayLength2D{
public int row() {
	int[][] exampleVariableOne = new int[10][5];
	int lengthOne = exampleVariableOne.length;
    return lengthOne;
      
}
public int column() {
	int[][] exampleVariableOne = new int[10][5];
	int lengthTwo = exampleVariableOne[0].length;
    return lengthTwo;  
}
}