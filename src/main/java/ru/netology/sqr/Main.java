package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        int lowerLimit = 200;
        int upperLimit = 300;
        SQRService sqrService = new SQRService();
        sqrService.rangeNum(lowerLimit, upperLimit);
        System.out.println("Цикл завершен");
    }
}
