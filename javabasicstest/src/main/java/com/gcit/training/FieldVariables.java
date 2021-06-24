package com.gcit.training;
public class FieldVariables{

public static int exampleVariableOne = 10;
public static int exampleVariableTwo = 6;

public static void main(String[] args) {
    
System.out.println(add(exampleVariableOne, exampleVariableTwo));
multiply();
  
}

public static int add(int x, int y) {

int exThree = x + y;
return exThree;
  
}

public static void multiply() {

System.out.println(exampleVariableOne * exampleVariableTwo);
  
}
}