package ru.netology.sqr;

public class SQRService {
    public int squareTheNumber(int max, int min) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= min && x <= max) {
                count++;
            }
        }
        return count;
    }
}