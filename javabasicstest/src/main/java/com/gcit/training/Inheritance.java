package com.gcit.training;
class add{
    void run1(){
        System.out.println("This is add class");
    }
}

class sub extends add{
    sub(){
        
    }
    sub(int a,int b){
    System.out.println(a-b);
    } 
    void run2(){
        System.out.println("This is sub class");
    }
}

class mul extends sub{
    
    mul(int a,int b){
    super(a,b);
    System.out.println(a*b);
    } 
    void run3(){
        System.out.println("This is mul class");
    }
}

public class Inheritance {


public static void main(String[] args)   {
        
mul m = new mul(5,3);
m.run1();
m.run2();    
m.run3();
        
}
}