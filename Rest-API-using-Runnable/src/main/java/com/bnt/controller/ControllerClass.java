package com.bnt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bnt.service.Armstrong;
import com.bnt.service.Cube;
import com.bnt.service.EvenOdd;
import com.bnt.service.Factorial;
import com.bnt.service.Palindrome;
import com.bnt.service.Prime;
import com.bnt.service.Reverse;
import com.bnt.service.Square;


@RestController
public class ControllerClass {

    @GetMapping("/number/{number}")
    public void operation(@PathVariable int number){
       Runnable[] runnables = {new Square(number), new Cube(number), 
                               new EvenOdd(number), new Prime(number), 
                               new Armstrong(number), new Factorial(number), 
                               new Palindrome(number), new Reverse(number)};
       for(Runnable runnable : runnables){
            new Thread(()->runnable.run()).start();
       }
    }
    
}
