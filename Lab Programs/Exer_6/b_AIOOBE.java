package Exer_6;

public class b_AIOOBE {
    public static void main(String[] args) {
        int[] ar = { 1, 4, 3 };
        try {
            for (int i = 0; i < 45; i++) {
                System.out.println(ar[i]);
            }
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Exception: Array Index Out Of Bounds Exception");
        }
    }
}
/*
 * Output:-
 * 1
 * 4
 * 3
 * Exception: Array Index Out Of Bounds Exception
 */
