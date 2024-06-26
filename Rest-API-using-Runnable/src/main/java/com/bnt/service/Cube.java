package com.bnt.service;

public class Cube implements Runnable{

    int number;

    public Cube(int number){
        this.number=number;
    }

    @Override
    public void run() {
      int result = number * number * number;
      System.out.println("Cube of number " + number + " is: " + result);
    }
    
    
}
