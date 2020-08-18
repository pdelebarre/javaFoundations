package edu.delebarre.types;

import java.util.Random;

public class PrimitiveTypesChallenge implements Challenge {
    Random randomizer = new Random();


    public void print() {
        byte byteVar= (byte) (randomizer.nextInt(Byte.MAX_VALUE));
        System.out.println( "Byte variable = " + byteVar);

        short shortVar = (short) (randomizer.nextInt(Short.MAX_VALUE));
        System.out.println( "Short variable = " + shortVar);

        int intVar = randomizer.nextInt(Integer.MAX_VALUE);
        System.out.println( "Integer variable = " + intVar);

        long longVar = 50000L+10L*(byteVar+shortVar+intVar);
        System.out.println("Long variable = "+longVar);
    }
}
