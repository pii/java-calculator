package com.calculator.operations;

public class Division implements Operation{
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }

    @Override
    public String symbol() {
        return "/";
    }
}
