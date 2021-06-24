package com.gcit.training;
public class TwoDimensionalArray{

  public static int[][] exampleVariableOne = new int[3][4];
  public static int[][] exampleVariableTwo = {{0, 1, 2, 3, 4}, {4, 5, 6, 7, 8}};
  public static boolean[][] exampleVariableThree = {{true, false, false, true}, {false, false, true, true}};

public static void main(String[] args) {
    exampleVariableOne[1][2] = 10000;
    System.out.println(exampleVariableOne[1][1]);
    System.out.println(exampleVariableTwo[1][3]);
    System.out.println(exampleVariableThree[0][2]);
  
}
}