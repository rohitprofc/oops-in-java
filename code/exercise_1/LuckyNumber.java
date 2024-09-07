package Exer_1;

import java.util.*;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        if (n < 1 || n > 100)
            System.exit(0);

        int a[] = new int[n];
        System.out.println("Enter elements into array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            a[i] = s.nextInt();

            if (a[i] < 1 || a[i] > 1000000)
                System.exit(0);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int sumCombinationsOfSeventhPowers = 0;
            for (int j = 1;; j++) {
                int seventhPowers = (int) Math.pow(7, j);
                sumCombinationsOfSeventhPowers += seventhPowers;

                if (a[i] == seventhPowers || a[i] == sumCombinationsOfSeventhPowers)
                    count++;

                else if (seventhPowers > a[i])
                    break;

            }
        }
        System.out.println(("No.of Lucky Numbers: " + count));
        s.close();
    }

}
/*
 * Output:-
 * Element 1: 7
 * Element 2: 28
 * Element 3: 343
 * No.of Lucky Numbers: 2
 */
