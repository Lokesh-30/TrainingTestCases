package com.gcit.training;
public class SwitchStatement {

  public static int exampleVariableOne = 37;

public static void main(String[] args) {

    switch (exampleVariableOne){
      case 35:
        System.out.println("exampleVariableOne is 35");
        break;
      case 36:
        System.out.println("exampleVariableOne is 36");
        break;
      case 37:
        System.out.println("exampleVariableOne is 37");
        break;
      case 38:
        System.out.println("exampleVariableOne is 38");
        break;
      case 39:
        System.out.println("exampleVariableOne is 39");
        break;
      case 40:
        System.out.println("exampleVariableOne is 40");
        break;
      default:
        System.out.println("exampleVariableOne has to be between 35 and 40");
    }
  }
}