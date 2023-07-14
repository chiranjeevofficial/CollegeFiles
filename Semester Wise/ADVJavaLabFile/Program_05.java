class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is Running");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is Running");
    }
}

public class Program_05 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
