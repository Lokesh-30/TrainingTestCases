package com.gcit.training;

public class Concatenation {

  public static String exampleVariableOne = "Hello ";
  public static String exampleVariableTwo = "World!";
  public static String exampleVariableThree = exampleVariableOne + exampleVariableTwo;
  public static String exampleVariableFour = exampleVariableOne.concat(exampleVariableTwo);

public static void main(String[] args) {
    System.out.println(exampleVariableThree);
    System.out.println(exampleVariableFour);
  
}
}