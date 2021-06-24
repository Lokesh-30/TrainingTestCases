package com.gcit.training;
public class ReturnStatement{

  public static int exampleVariableOne = 100;

public static void main(String[] args) {
    System.out.println(count());
}

public static String count() {
    while (exampleVariableOne > 0) {
      if (exampleVariableOne == 25) {
        return "exampleVariableOne is 25";
      }
      exampleVariableOne--;
    }
    return "exampleVariableOne is never equal to 25";
  }
}