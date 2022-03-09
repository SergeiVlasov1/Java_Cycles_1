package ru.netology.sqr;

public class SQRService {

    public int rangenum(int lowerlimit, int upperlimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerlimit && i * i <= upperlimit) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
