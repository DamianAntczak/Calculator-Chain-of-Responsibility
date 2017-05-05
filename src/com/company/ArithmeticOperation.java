package com.company;

/**
 * Created by Damian on 05.05.2017.
 */
public class ArithmeticOperation {
    private double arg1;
    private double arg2;
    private char operator;

    public ArithmeticOperation(double arg1, double arg2, char operator){
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return arg1 + " " + operator + " " + arg2;
    }

    public char getOperator() {
        return operator;
    }

    public double getArg1() {
        return arg1;
    }

    public double getArg2() {
        return arg2;
    }
}
