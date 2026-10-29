package com.calculator.operations;

public class Subtraction implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a-b;
    }

    @Override
    public String symbol() {
        return "-";
    }
}
