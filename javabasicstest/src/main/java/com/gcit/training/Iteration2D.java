package com.gcit.training;
public class Iteration2D {

  public static int[][] exampleVariableOne = {{0, 1, 2, 3, 4}, {4, 5, 6, 7, 8}};

public static void main(String[] args) {
    for (int countOne = 0; countOne < exampleVariableOne.length; countOne++) {
      for (int countTwo = 0; countTwo < exampleVariableOne[countOne].length; countTwo++) {
        System.out.print("Index [" + countOne + "][" + countTwo + "]: ");
        System.out.println(exampleVariableOne[countOne][countTwo]);
      }
    }
  }
}