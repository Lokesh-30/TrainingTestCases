package com.gcit.training;
public class ElseIfStatement {

  public static int exampleVariableOne = 37;

public static void main(String[] args) {
    if (exampleVariableOne < 10 ) {
      System.out.println("It is smaller than 10");
    } else if (exampleVariableOne < 20 ) {
      System.out.println("It between 10 and 20");
    } else if (exampleVariableOne < 30 ) {
      System.out.println("It between 20 and 30");
    } else {
      System.out.println("It is larger than 30");
    }
  }
}