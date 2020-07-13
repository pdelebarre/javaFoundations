package designpatterns.creational.factory;

public class CarFactory {
    public Car getCar(String model) {
        if(model.equalsIgnoreCase("XC90")) {
            return new XC90();
        } else if(model.equalsIgnoreCase("Espace")){
            return new Espace();
        }
        return null;
    }
}
