package com.example;

class PrimeNumber {

    private static void generatePrimeNumbers(int startNumber, int endNumber) {
        if (!validateNumberRange(startNumber, endNumber)) {
            return;
        }

        boolean primeFound = false;
        for (int i = startNumber; i <= endNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeFound = true;
            }
        }
        if (!primeFound) {
            System.out.println("There is no prime number between the range " + startNumber + " and " + endNumber);
        }
    }

    private static boolean validateNumberRange(int startNumber, int endNumber) {
        if (startNumber < 0 || endNumber < 0) {
            System.out.println("Invalid range");
            return false;
        }
        if (startNumber > endNumber) {
            System.out.println("Starting number(" + startNumber + ") should be less than ending number(" + endNumber + ")");
            return false;
        }
        return true;
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber.generatePrimeNumbers(1, 23);
        PrimeNumber.generatePrimeNumbers(-2, 34);
        PrimeNumber.generatePrimeNumbers(24, 26);
        PrimeNumber.generatePrimeNumbers(20, 10);
    }
}
