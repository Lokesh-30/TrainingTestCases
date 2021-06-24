package com.gcit.training;
public class TrimmingString {

  public static String exampleVariableOne = "      Hello World!      ";
  public static String exampleVariableTwo = exampleVariableOne.trim();

public static void main(String[] args) {
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableTwo);
  
}
}