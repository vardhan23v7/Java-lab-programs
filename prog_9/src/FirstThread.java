import java.util.Random;

public class FirstThread extends Thread {
    public void run() {
        Random obj = new Random();
        while (true) {
            int rand = obj.nextInt(20);
            System.out.println("Random number generated is " + rand);

            // Start SecondThread
            SecondThread secThread = new SecondThread(rand);
            secThread.start();

            // Start ThirdThread
            ThirdThread thirThread = new ThirdThread(rand);
            thirThread.start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error occurred in sleep");
            }
        }
    }

    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        t1.start();
    }
}

class SecondThread extends Thread {
    private int num;

    // Constructor corrected (removed semicolon)
    public SecondThread(int n) {
        num = n;
    }

    public void run() {
        int square = num * num;
        System.out.println("The square of the number " + num + " is " + square);
    }
}

class ThirdThread extends Thread {
    private int num;

    // Constructor corrected (removed semicolon)
    public ThirdThread(int n) {
        num = n;
    }

    public void run() {
        // Fixed typo: num*numu*num -> num*num*num
        int cube = num * num * num;
        System.out.println("The cube of the number " + num + " is " + cube);
    }
}
