package com.gcit.training;
public class InfiniteLoop{

  public static boolean exampleVariableOne = true;
  public static int exampleVariableTwo = 0;
  public static int counter = 0;

public static void main(String[] args) {

    while (exampleVariableOne) {
      System.out.print(exampleVariableTwo + " ");
      exampleVariableTwo++;
      if (exampleVariableTwo > 10) {
        exampleVariableOne = false;
      }
    }
  }
}