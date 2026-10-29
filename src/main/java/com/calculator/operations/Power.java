package com.calculator.operations;

public class Power implements Operation {
    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public String symbol() {
        return "^";
    }
}
