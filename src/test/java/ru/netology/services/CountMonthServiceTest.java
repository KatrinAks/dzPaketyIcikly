package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services;

public class CountMonthServiceTest {

    @Test
    public void CountMonthRest() {
        CountMonthService service = new CountMonthService();


        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);

        //System.out.println("1." + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CountMonthRests() {
        CountMonthService service = new CountMonthService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        //System.out.println("2." + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
}
