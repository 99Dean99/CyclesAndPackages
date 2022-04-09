package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRTest {
    @ParameterizedTest(name = "{0}")
    @CsvSource(value = {
            "'range of numbers from 10 to 99'.1.99.10.99.6",
            "'range of numbers from 10 to 99, lower'.1.99.81.99.1",
            "'range of numbers from 10 to 99, upper'.1.99.10.16.1",
            "'range of numbers from 10 to 99, average'.1.99.36.49.2"},
    delimiter = '.')
    void shouldShowTheNumberOfSquares(String testName, int first_number, int last_number, int lower, int upper, int expectedAmount){
        SQRServiceTest counter = new SQRServiceTest();
        int actualAmount = counter.sqrServiceTest(first_number, last_number, lower, upper);
        assertEquals(expectedAmount, actualAmount);
    }
}