package com.kodilla.stream.lambda;

import com.kodilla.stream.lambda.Executor;

public class ExecuteSaySomething implements Executor {

    @Override
    public void process() {
        System.out.println("This is an example text.");
    }
}