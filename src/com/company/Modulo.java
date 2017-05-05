package com.company;

/**
 * Created by Damian on 05.05.2017.
 */
public class Modulo implements OperationChain {
    private OperationChain chain;

    @Override
    public void setNextChain(OperationChain nextChain) {
        this.chain = nextChain;

    }

    @Override
    public double calculate(ArithmeticOperation operation) {

        if(operation.getOperator() == '%'){
            return  operation.getArg1() % operation.getArg2();
        }
        else{
            return this.chain.calculate(operation);
        }
    }
}
