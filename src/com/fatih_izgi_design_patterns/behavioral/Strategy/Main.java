package com.fatih_izgi_design_patterns.behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("12 + 6 = "+addButtonClickListener(12,6));
        System.out.println("12 - 6 = "+subtractButtonClickListener(12,6));
        System.out.println("12 * 6 = "+multiplyButtonClickListener(12,6));
        System.out.println("12 / 6 = "+divideButtonClickListener(12,6));

    }
    public static double addButtonClickListener(double firstNumber, double secondNumber){
        return OperationFactory.getAdder().calculate(firstNumber, secondNumber);
    }

    public static double subtractButtonClickListener(double firstNumber, double secondNumber){
        return OperationFactory.getSubracter().calculate(firstNumber, secondNumber);
    }

    public static double multiplyButtonClickListener(double firstNumber, double secondNumber){
        return OperationFactory.getMultiplier().calculate(firstNumber, secondNumber);
    }

    public static double divideButtonClickListener(double firstNumber, double secondNumber){
        return OperationFactory.getDivider().calculate(firstNumber, secondNumber);
    }

}
