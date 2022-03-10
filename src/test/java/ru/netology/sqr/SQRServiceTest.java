package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "from 10 to 99 range 0-10, 0, 0,10",
            "from 10 to 99 range 0-100, 1, 0,100",
            "from 10 to 99 range 1000-4901, 39, 1000,4901",
            "from 10 to 99 range 0-9800, 89, 0,9800",
            "from 10 to 99 range 0-10000, 90, 0,10000",
            "from 10 to 99 range -1-1000, 0, -1,-1000"
    })
    public void rangeNum(String sqrServiceTest, int expected, int lowerlimit, int upperLimit) {
        SQRService sqrService = new SQRService();

        int actual = sqrService.rangeNum(lowerlimit, upperLimit);

        assertEquals(actual, expected);
    }

}