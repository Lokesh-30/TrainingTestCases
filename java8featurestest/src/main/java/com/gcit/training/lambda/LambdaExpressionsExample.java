package com.gcit.training.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionsExample {

    public static void main(String... args) {
       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
       Runnable num = n -> System.out.print(n);
       numbers.forEach(num);
       System.out.print((int)num);   
    }   
}
