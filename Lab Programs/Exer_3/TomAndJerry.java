package Exer_3;

public class TomAndJerry {
    public static void main(String[] args) {

        callByValue();
        callByReference();

    }

    public static void swap_val(int tom, int jerry) {
        System.out.println("Before Swapping (Inside): ");
        System.out.println("Tom has " + tom + " apples, Jerry has " + jerry + " apples");

        int temp = tom;
        tom = jerry;
        jerry = temp;

        System.out.println("After Swapping (Inside): ");
        System.out.println("Tom has " + tom + " apples, Jerry has " + jerry + " apples");

        System.out.println();
    }

    public static void swap_ref(TempClass tom, TempClass jerry) {
        System.out.println("Before Swapping (Inside): ");
        System.out.println("Tom has " + tom.tj + " apples, Jerry has " + jerry.tj + " apples");

        TempClass temp = new TempClass(tom.tj);
        tom.tj = jerry.tj;
        jerry.tj = temp.tj;

        System.out.println("After Swapping (Inside): ");
        System.out.println("Tom has " + tom.tj + " apples, Jerry has " + jerry.tj + " apples");

        System.out.println();
    }

    public static void callByValue() {
        System.out.println("Call by Value: ");
        int tom = 51;
        int jerry = 45;

        System.out.println();

        System.out.println("Before Swapping: ");
        System.out.println("Tom has " + tom + " apples, Jerry has " + jerry + " apples");

        System.out.println();

        swap_val(tom, jerry);

        System.out.println("After Swapping: ");
        System.out.println("Tom has " + tom + " apples, Jerry has " + jerry + " apples");

        System.out.println();

    }

    public static void callByReference() {
        System.out.println("Call by Reference: ");

        TempClass tam = new TempClass(51);
        TempClass jarry = new TempClass(45);

        System.out.println();

        System.out.println("Before Swapping: ");
        System.out.println("Tom has " + tam.tj + " apples, Jerry has " + jarry.tj + " apples");

        System.out.println();

        swap_ref(tam, jarry); // Invoke swap method

        System.out.println("After Swapping: ");
        System.out.println("Tom has " + tam.tj + " apples, Jerry has " + jarry.tj + " apples");

        System.out.println();
    }

}

class TempClass {
    int tj;

    TempClass(int tj) {
        this.tj = tj;
    }
}
/*
 * Output:-
 * Call by Value:
 * 
 * Before Swapping:
 * Tom has 51 apples, Jerry has 45 apples
 * 
 * Before Swapping (Inside):
 * Tom has 51 apples, Jerry has 45 apples
 * After Swapping (Inside):
 * Tom has 45 apples, Jerry has 51 apples
 * 
 * After Swapping:
 * Tom has 51 apples, Jerry has 45 apples
 * 
 * Call by Reference:
 * 
 * Before Swapping:
 * Tom has 51 apples, Jerry has 45 apples
 * 
 * Before Swapping (Inside):
 * Tom has 51 apples, Jerry has 45 apples
 * After Swapping (Inside):
 * Tom has 45 apples, Jerry has 51 apples
 * 
 * After Swapping:
 * Tom has 45 apples, Jerry has 51 apples
 */