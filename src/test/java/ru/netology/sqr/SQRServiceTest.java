package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    void calculateQuantityInLimits200_300() {
        SQRService service = new SQRService();

        int actual = service.squareTheNumber(300, 200);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateQuantityInLimits300_500() {
        SQRService service = new SQRService();

        int actual = service.squareTheNumber(500, 300);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}