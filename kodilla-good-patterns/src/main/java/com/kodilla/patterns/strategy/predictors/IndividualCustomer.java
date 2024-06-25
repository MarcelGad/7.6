package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.predictors.ConservativePredictor;
import com.kodilla.patterns.strategy.predictors.Customer;

public class IndividualCustomer extends Customer {
    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}