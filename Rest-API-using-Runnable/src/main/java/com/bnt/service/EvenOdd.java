package com.bnt.service;

public class EvenOdd implements Runnable{

     int number;

  
    public EvenOdd(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    

}
