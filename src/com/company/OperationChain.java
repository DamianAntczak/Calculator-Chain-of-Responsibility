package com.company;

/**
 * Created by Damian on 05.05.2017.
 */
public interface OperationChain {
    void setNextChain(OperationChain nextChain);

    double calculate(ArithmeticOperation operation);
}
