package com.gcit.training;
public class WhileLoop {

  public static int exampleVariableOne = 0;
  public static int exampleVariableTwo = 10;

public static void main(String[] args) {
    System.out.println("Counting forward from 0-10:");
    while (exampleVariableOne <= 10) {
      System.out.print(exampleVariableOne + " ");
      exampleVariableOne++;
    }
    System.out.println("Counting backward from 0-10:");
    while (exampleVariableTwo >= 0) {
      System.out.print(exampleVariableTwo + " ");
      exampleVariableTwo--;
    }
  }
}