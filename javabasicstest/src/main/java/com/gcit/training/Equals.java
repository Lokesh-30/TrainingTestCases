package com.gcit.training;
public class Equals {

  public static String exampleVariableOne = "Elephant";
  public static String exampleVariableTwo = new String("Ant");
  public static boolean exampleVariableThree = exampleVariableOne.equals(exampleVariableTwo);
  public static boolean exampleVariableFour = exampleVariableOne == exampleVariableTwo;

public static void main(String[] args) {
    System.out.println(exampleVariableThree);
    System.out.println(exampleVariableFour);
  
}
}