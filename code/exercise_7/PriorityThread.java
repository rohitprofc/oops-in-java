package Exer_7;

public class PriorityThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1", Thread.NORM_PRIORITY);
        MyThread t2 = new MyThread("Thread 2", Thread.MAX_PRIORITY);
        MyThread t3 = new MyThread("Thread 3", Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread extends Thread {
    public MyThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(currentThread().getName());
    }
}

/*
 * Output:-
 * Thread 2
 * Thread 3
 * Thread 1
 */