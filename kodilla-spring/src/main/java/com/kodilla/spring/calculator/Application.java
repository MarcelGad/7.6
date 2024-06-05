package com.kodilla.spring.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(2, 2);
        calculator.div(25, 5);
        calculator.mul(100, 25);
        calculator.sub(80, 40);

    }
}