    package com.bnt.service;

    public class Square implements Runnable{

        int number;

        public Square(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            int result = number * number;
            System.out.println("Square of number " + number + " is: " + result);
        }
        
    }
