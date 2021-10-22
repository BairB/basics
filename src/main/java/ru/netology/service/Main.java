package ru.netology.service;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CashbackHackService cashbackHackService = new CashbackHackService();
        {
            System.out.println("It should return 100 if less 1000");
            int result = cashbackHackService.remain(900);
            System.out.println(100 == result);
        }
        {
            System.out.println("It should return 900 if more 1000");
            int result = cashbackHackService.remain(1100);
            System.out.println(900 == result);
        }
    }
}
