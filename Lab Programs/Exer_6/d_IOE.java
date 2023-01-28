package Exer_6;

import java.util.*;

public class d_IOE {
    public static void main(String[] args)
    throws Exception
    {
        String s = "Hey! I'am Rohit";
        Scanner sc = new Scanner(s);
        System.out.println("" + sc.nextLine());
        System.out.println("" + sc.ioException());
        sc.close();
    }
}
