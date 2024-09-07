package Exer_6;

public class a_AE {

    public static void main(String[] args) {
        Integer a = Integer.parseInt(args[0]);
        Integer b = Integer.parseInt(args[1]);

        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println("Exception: Arithmetic Exception");
        }
    }
}
/*
 * Output:-
 * D:\Coding\OOPS-in-JAVA\Lab Programs\Exercise_6>java a 5 0
 * Exception: Arithmetic Exception
 */
