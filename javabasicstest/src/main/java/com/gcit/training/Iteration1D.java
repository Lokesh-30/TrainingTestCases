package com.gcit.training;
public class Iteration1D{

  public static int[] exampleVariableOne = {0, 1, 2, 3, 4, 5, 6, 7, 8};
  public static int sum = 0;

public static void main(String[] args) {

    for (int count = 0; count < exampleVariableOne.length; count++) {
    sum += exampleVariableOne[count];
    }
    System.out.println(sum);
  }
}