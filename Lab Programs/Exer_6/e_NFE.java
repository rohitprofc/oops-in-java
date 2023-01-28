package Exer_6;

public class e_NFE {
    public static void main(String[] args) {
        String s = "Rohit";
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException nfe) {
            System.out.println("Exception: Number Format Exception");
        }
    }
}
/*
 * Output:-
 * Exception: Number Format Exception
 */
