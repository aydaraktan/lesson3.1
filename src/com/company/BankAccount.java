package com.company;

public class BankAccount {
    private double amount = 0; // остаток на счете

    public double getAmount() { //возвращает текущий остаток на счету
        return amount;
    }

    public void deposit(double sum) // положить деньги на счет
    {
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitException  // снимает указанную сумму со счета
    {
        if (amount<sum) {
            throw new LimitException("у вас недостаточно средств", amount);
        }

        amount = amount - sum;

    }
}
