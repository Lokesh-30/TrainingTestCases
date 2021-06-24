package com.gcit.training;
public class ForLoop {

  public static int exampleVariableOne = 10;
  
public static void main(String[] args) {
    System.out.println("Counting forward from 0-10:");
    for(int countOne = 0; countOne <= exampleVariableOne; countOne++) {
      System.out.print(countOne + " ");
    }
    System.out.println("Counting backward from 0-10:");
    for(int countTwo = exampleVariableOne; countTwo >= 0; countTwo--) {
      System.out.print(countTwo + " ");
    }
  }
}