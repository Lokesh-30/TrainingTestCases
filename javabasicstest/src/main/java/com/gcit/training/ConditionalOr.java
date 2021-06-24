package com.gcit.training;

public class ConditionalOr {

  public static boolean exampleVariableOne = true;
  public static boolean exampleVariableTwo = true;
  public static boolean exampleVariableThree = false;
  public static boolean exampleVariableFour = false;

public static void main(String[] args) {

    if (exampleVariableOne || exampleVariableTwo) {
      System.out.println("The boolean expression is true");
    } else {
      System.out.println("The boolean expression is false");
    }
    if (exampleVariableOne || exampleVariableThree) {
      System.out.println("The boolean expression is true");
    } else {
      System.out.println("The boolean expression is false");
    }
    if (exampleVariableThree || exampleVariableFour) {
      System.out.println("The boolean expression is true");
    } else {
      System.out.println("The boolean expression is false");
    }
  }
}