package com.automat2.bankApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BankProApp {

    private static final Map<String, Client> clients = new HashMap<>();
    public static void main(String[] args) {

        Client tima = new Client("Tima Jef","123");

        DepositAccount timaDeposit = new DepositAccount(tima, Currency.USD);
        CreditAccount timaCreditAccount = new CreditAccount(tima, Currency.EUR);

        tima.addAccount(timaDeposit);
        tima.addAccount(timaCreditAccount);
      //  clients.put(tima.getClientId(), tima);
    }
}
