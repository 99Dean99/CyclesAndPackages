package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {
        final int first_number = 1;
        final int last_number = 99;
        final int lower = 10;
        final int upper = 99;
        SQRServiceTest counter = new SQRServiceTest();
        System.out.println("Колличество квадратов:"
                + counter.sqrServiceTest(first_number, last_number, lower, upper));
    }
}