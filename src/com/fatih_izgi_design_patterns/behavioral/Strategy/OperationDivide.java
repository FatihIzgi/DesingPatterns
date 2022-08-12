package com.fatih_izgi_design_patterns.behavioral.Strategy;

class OperationDivide implements OperationStrategy{

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber/secondNumber;
    }
}
