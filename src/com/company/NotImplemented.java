package com.company;

/**
 * Created by Damian on 05.05.2017.
 */
public class NotImplemented implements OperationChain {
    private OperationChain chain;

    @Override
    public void setNextChain(OperationChain nextChain) {
        this.chain = nextChain;

    }

    @Override
    public double calculate(ArithmeticOperation operation) {

        throw new RuntimeException("Not implemented operator");
    }
}
