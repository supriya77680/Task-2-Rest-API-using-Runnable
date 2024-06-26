package com.bnt.service;

public class Factorial implements Runnable {

    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

