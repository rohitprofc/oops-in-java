package Misc;
import java.util.*;

public class DigitSeparation {

    public static String DigitExtract(String str) {

        str = str.replaceAll("[^0-9]", " ");
        str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return "-1";

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr String: ");
        String str = sc.nextLine();
        System.out.print(DigitExtract(str));
        sc.close();
    }

}
