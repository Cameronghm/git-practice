package com.qa.com.qa;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account act;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        act = new Account(new String[]{"Visa", "Mastercard", "Amex"}, "15-04-23", "123456789", "password");

    }

    @org.junit.jupiter.api.Test
    void compareTo() {
        Account otherAct = new Account(new String[]{"Visa"}, "15-04-23", "123456789", "password");
        assertEquals(0, act.compareTo(otherAct), "Login Failed");
    }

    @org.junit.jupiter.api.Test
    void rightAccountNum() {
        Account otherAct2 = new Account(new String[]{"Visa"}, "15-04-23", "123456710", "password");
        assertEquals(true, (otherAct2.getAccountNumber().equals("123456710")));
    }
}