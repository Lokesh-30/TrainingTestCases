package com.gcit.training.interfaces.functional;

@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);
}
