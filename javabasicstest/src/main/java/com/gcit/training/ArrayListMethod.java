package com.gcit.training;

import java.util.ArrayList;

public class ArrayListMethod{

  public static ArrayList<String> exampleVariableOne = new ArrayList<String>();

public static void main(String[] args) {

    exampleVariableOne.add("Hello");
    exampleVariableOne.add(0, "World");
    System.out.println(exampleVariableOne);
    exampleVariableOne.remove(0);
    exampleVariableOne.set(0, "Java");
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableOne.get(0));
    System.out.println(exampleVariableOne.size());
  
}
}