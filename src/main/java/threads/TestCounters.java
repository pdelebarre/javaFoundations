package threads;

public class TestCounters {
    public static void main(String[] args) {
        Thread thread[] = new Thread[10];
        for(int i=0;i<10;i++) {
            thread[i] = new Thread(new Counter(Integer.toString(i)));
            thread[i].start();
        } 
    }

}
