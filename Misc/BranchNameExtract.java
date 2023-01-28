package Misc;
import java.util.*;

public class BranchNameExtract {
    public static void main(String[] args) {
        String AIDS = "54";
        String CSE = "05";
        String CIVIL = "01";
        String EEE = "02";
        String MECH = "03";
        String ECE = "04";
        String IT = "12";
        String AIML = "42";
        String IOT = "62";
        String bc = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        String rollNumber = sc.nextLine();
        for (int i = 6; i < 8; i++) {
            char ch = rollNumber.charAt(i);
            bc += ch;
        }
        if (AIDS.equals(bc))
            System.out.println("AI&DS Branch");
        else if (CSE.equals(bc))
            System.out.println("CSE Branch");
        else if (AIML.equals(bc))
            System.out.println("AIML Branch");
        else if (CIVIL.equals(bc))
            System.out.println("CIVIL Branch");
        else if (MECH.equals(bc))
            System.out.println("MECH Branch");
        else if (ECE.equals(bc))
            System.out.println("ECE Branch");
        else if (EEE.equals(bc))
            System.out.println("EEE Branch");
        else if (IT.equals(bc))
            System.out.println("IT Branch");
        else if (IOT.equals(bc))
            System.out.println("IOT Branch");
        sc.close();
    }

}
/*
 * Output:-
 * Enter Roll Number: 21481A5451
 * AI&DS Branch
 * Enter Roll Number: 21481A0545
 * CSE Branch
 */
