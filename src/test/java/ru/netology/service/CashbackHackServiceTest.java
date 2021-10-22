package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn100ifLessThan1000(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0if1000(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn900ifMoreThan1000(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }

}