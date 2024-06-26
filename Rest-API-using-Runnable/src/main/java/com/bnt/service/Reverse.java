package com.bnt.service;

public class Reverse implements Runnable {

    int number;

    public Reverse(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reverse of number is: " + reversed);
    }
}

