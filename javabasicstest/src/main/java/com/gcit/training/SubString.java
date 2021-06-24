package com.gcit.training;
public class SubString {

  public static String exampleVariableOne = "Hello World!";
  public static String exampleVariableTwo = exampleVariableOne.substring(0, 5);
  public static String exampleVariableThree = exampleVariableOne.substring(6);

public static void main(String[] args) {
    System.out.println(exampleVariableTwo);
    System.out.println(exampleVariableThree);
  
}
}