package abundanceNumber;

import java.util.Scanner;

public class Abundance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        checkAbu cb = new checkAbu();
        cb.abu(n);
    }
}
