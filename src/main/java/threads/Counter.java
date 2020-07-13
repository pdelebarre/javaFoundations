package threads;

import java.util.Random;

public class Counter implements Runnable {
    int time;
    Random r;
    String name;

    public Counter(String name) {
       r = new Random();
       this.name=name;
       time = r.nextInt(999);
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s going to sleep for %d ms\n",name,time);
            Thread.sleep(time);
            System.out.printf("%s waking up\n",name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
