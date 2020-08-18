package creational.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1==s2) {
            System.out.println("there are one and the same thing");
        } else System.out.println("what????!!!!");
    }
}
