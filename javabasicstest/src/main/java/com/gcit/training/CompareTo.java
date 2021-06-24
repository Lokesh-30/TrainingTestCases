package com.gcit.training;

public class CompareTo {

  public static String exampleVariableOne = "Ant";
  public static String exampleVariableTwo = "ant";
  public static String exampleVariableThree = "Butterfly";
  public static String exampleVariableFour = "Zebra";
  public static int exampleVariableFive = exampleVariableOne.compareTo(exampleVariableTwo);
  public static int exampleVariableSix = exampleVariableTwo.compareTo(exampleVariableOne);
  public static int exampleVariableSeven = exampleVariableThree.compareTo(exampleVariableOne);
  public static int exampleVariableEight = exampleVariableFour.compareTo(exampleVariableOne);

public static void main(String[] args) {
    System.out.println(exampleVariableFive);
    System.out.println(exampleVariableSix);
    System.out.println(exampleVariableSeven);
    System.out.println(exampleVariableEight);
  
}
}