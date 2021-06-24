package com.gcit.training;
public class LoopVariable {

  public static int exampleVariableOne = 10;
  public static int counterOne = 0;

public static void main(String[] args) {
    System.out.println("Counting forward from 0-10:");
    while (exampleVariableOne >= counterOne) {
      System.out.print(counterOne + " ");
      counterOne++;
    }
    System.out.println("Counting backward from 0-10:");
    for (int counterTwo = exampleVariableOne; counterTwo >= 0; counterTwo--) {
      System.out.print(counterTwo + " ");
    }
  }
}