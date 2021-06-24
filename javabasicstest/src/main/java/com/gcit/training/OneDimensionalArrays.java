package com.gcit.training;
public class OneDimensionalArrays{

  public static int[] exampleVariableOne;
  public static int[] exampleVariableTwo = {0, 1, 2, 3, 4, 5, 6, 7, 8};
  public static boolean[] exampleVariableThree = {true, false, false, true};

public static void main(String[] args) {

    exampleVariableTwo[0] = 10;
    System.out.println(exampleVariableTwo[3]);
    System.out.println(exampleVariableThree[1]);

  }
}
