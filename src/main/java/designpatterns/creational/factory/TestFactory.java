package designpatterns.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFactory {
    public static void main(String[] args) throws IOException {
        CarFactory carFactory = new CarFactory();

        System.out.println("which model?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String model = br.readLine();

        System.out.println("ordering a " + model + " from " + carFactory.getCar(model).getBrand());

    }
}
