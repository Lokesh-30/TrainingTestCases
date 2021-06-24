package com.gcit.training;
public class LocalVariable {

public static int exampleVariableOne = 10;
public static int exampleVariableTwo = 6;

public static void main(String[] args) {

System.out.println(add(exampleVariableOne, exampleVariableTwo));

}

public static int add(int x, int y) {
   
int exThree = x + y;
return exThree;
  
}
}