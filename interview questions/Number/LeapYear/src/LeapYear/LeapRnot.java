package LeapYear;

import java.util.Scanner;

public class LeapRnot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        First fi = new First();
        fi.leap(n);
    }
}
