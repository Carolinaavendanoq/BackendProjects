package com.ctd.paymentLiquidator.main.service;

public class Liquidator {
    public void paymentLiquidator(){
        // calculate
        int amount = 0;
        // Print
        // Deposit
        depositMoney(amount);
    }

    private void depositMoney(int amount) {
        System.out.println("La liquidación generada es un documento digital. Saldo a liquidar: " + amount);
    }
}