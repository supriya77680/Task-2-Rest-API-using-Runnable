package com.bnt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Prime implements Runnable {

    public static final Logger logger = LoggerFactory.getLogger(Prime.class);

    int number;

    public Prime(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            logger.info(number + " is prime." +" (Thread: " + Thread.currentThread().getName() + ")");
        } else {
            logger.info(number + " is not prime."+ " (Thread: " + Thread.currentThread().getName() + ")");
        }
    }
}
