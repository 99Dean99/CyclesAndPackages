package ru.netology.sqr;

class SQRServiceTest {
    public int sqrServiceTest(int first_number, int last_number, int lower, int upper) {
        int numberSquare = 0;
        for (int i = first_number; i <= last_number; i++) {
            if (lower <= i * i && i * i <= upper) {
                System.out.print("*** i= " + i + ", i**2 = " + i * i + "\n");
                numberSquare++;
            }
        }
        return numberSquare;
    }
}

