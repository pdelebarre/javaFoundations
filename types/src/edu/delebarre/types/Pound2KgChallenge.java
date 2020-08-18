package edu.delebarre.types;

public class Pound2KgChallenge implements Challenge {

    public void print(){
        int pound = 124;
        double kg = pound * 0.45359237d;

        System.out.println(pound+" pounds in kilograms is "+ kg+" kg.");
    }
}
