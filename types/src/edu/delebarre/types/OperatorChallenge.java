package edu.delebarre.types;

public class OperatorChallenge implements Challenge {

    @Override
    public void print() {
        double a = 20.00d;
        double b = 80.00d;
        double c = (a+b)*100.00d;
        System.out.println(c % 40.00 == 0);
    }
}
