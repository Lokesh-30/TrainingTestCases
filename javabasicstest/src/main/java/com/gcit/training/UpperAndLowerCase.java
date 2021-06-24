package com.gcit.training;
public class UpperAndLowerCase {

  public static String exampleVariableOne = "Hello World!";
  public static String exampleVariableTwo = exampleVariableOne.toUpperCase();
  public static String exampleVariableThree = exampleVariableOne.toLowerCase();

public static void main(String[] args) {
    System.out.println(exampleVariableTwo);
    System.out.println(exampleVariableThree);
  
}
}