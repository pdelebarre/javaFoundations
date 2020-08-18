package edu.delebarre.types;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class Main {
    static long minLong = Long.MIN_VALUE;
    static long maxLong = Long.MAX_VALUE;

    static long myLong = 123_456_789_123_456L;

    public static void main(String[] args) {
        System.out.println("min Long " + minLong);
        System.out.println("max Long " + maxLong);
        System.out.println("my Long " + myLong);
        float myFloat = 3.14f;
        System.out.println("my float " + myFloat);

        char myUnicode='\u00A9';
        System.out.println("my unicode char "+myUnicode);

        System.out.println("Challenge 1: " +PrimitiveTypesChallenge.class.getName());
        Challenge challenge = new PrimitiveTypesChallenge();
        challenge.print();

        challenge = new Pound2KgChallenge();
        challenge.print();

        //System.out.println(123 | 1);

        challenge = new OperatorChallenge();
        challenge.print();
    }


}
