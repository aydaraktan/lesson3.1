package com.company;

public class LimitException extends Exception {
    private double remainingAmount;

    LimitException(String massage,double remainingAmount)
    {super(massage);
       this.remainingAmount=remainingAmount;

    }

    public double getRemainingAmount() {
       return remainingAmount;
    }
}
