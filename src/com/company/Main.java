package com.company;

public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);


        while (true) {
            try {
                System.out.println("ваш счет составляет " + bankAccount.getAmount());
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                try {
                    System.out.println(e.getRemainingAmount() + e.getMessage());
                    bankAccount.withDraw((int)bankAccount.getAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                 break;
            }
            System.out.println("остаток на вашем счету " + bankAccount.getAmount());

        }
        System.out.println(bankAccount.getAmount());
    }
}
