package ru.netology.sqr;

public class SQRService {

    public int rangenum(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
