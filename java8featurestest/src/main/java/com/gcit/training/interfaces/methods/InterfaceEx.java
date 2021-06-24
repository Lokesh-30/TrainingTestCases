package com.gcit.training.interfaces.methods;

public interface InterfaceEx {

    default void info() {
        System.out.println("Default method in interface");
    }

    default double findSqrt(double number) {
        return Math.sqrt(number);
    }
   
    static double pow(double number, double pow) {
        return Math.pow(number, pow);
    }
}
