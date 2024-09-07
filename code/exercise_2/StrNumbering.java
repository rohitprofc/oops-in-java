package Exer_2;

import java.util.Scanner;

public class StrNumbering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of characters: ");
        int n = sc.nextInt();
        String tem = sc.nextLine();
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        for (int i = 0; i < n; i++) {
            int c = 0;
            char c1 = str.charAt(i);
            for (int j = i + 1; j < n; j++) {
                char c2 = str.charAt(j);
                if (c1 < c2)
                    c += 1;
            }
            System.out.print(c + " ");
        }
        System.out.print(tem);
        sc.close();
    }
}
/*
 * Output 1:-
 * Enter no.of characters: 3
 * Enter String: abc
 * 2 1 0
 * Output 2:-
 * Enter no.of characters: 5
 * Enter String: aaabb
 * 2 2 2 0 0
 */
