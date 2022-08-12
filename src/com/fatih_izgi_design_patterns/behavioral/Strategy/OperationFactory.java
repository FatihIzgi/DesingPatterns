package com.fatih_izgi_design_patterns.behavioral.Strategy;

class OperationFactory{

    public static OperationAdd getAdder(){
        return  new OperationAdd();
    }

    public static OperationSubstract getSubracter(){
        return  new OperationSubstract();
    }

    public static OperationMultiply getMultiplier(){
        return new OperationMultiply();
    }

    public static OperationDivide getDivider(){
        return  new OperationDivide();
    }
}
