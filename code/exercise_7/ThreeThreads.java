package Exer_7;

public class ThreeThreads {

    public static void main(String[] args) {
        GM t1 = new GM();
        Hello t2 = new Hello();
        Welcome t3 = new Welcome();

        t1.start();
        t2.start();
        t3.start();
    }
}

class GM extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                break;
            }
        }
    }

}

class Hello extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                break;
            }
        }
    }

}

class Welcome extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome...!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                break;
            }
        }
    }

}
/*
 * Output:-
 * Good Morning
 * Hello
 * Good Morning
 * Welcome...!
 * Good Morning
 * HelloGood Morning
 * Good Morning
 * Welcome...!
 * Hello
 * Good Morning
 * Good Morning
 * Hello
 * Good Morning
 * Welcome...!
 * Good Morning
 * Hello
 * Good Morning
 * Good Morning
 * Welcome...!
 * Hello
 * Good Morning
 * Good Morning
 * Hello
 * Good Morning
 * Welcome...!
 * Good Morning
 * Hello
 * Good Morning
 * Good Morning
 * Welcome...!
 * Hello
 * Good Morning
 * Good Morning
 * Hello
 * Good Morning
 * Welcome...!
 * Good Morning
 * Hello
 * Good Morning
 * Good Morning
 * Welcome...!
 * Hello
 * Good Morning
 * Good Morning
 * Hello
 * Good Morning
 * Welcome...!
 * .......
 * .......
 * .......
 * .......
 * 
 */