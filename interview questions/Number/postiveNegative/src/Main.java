import java.util.*;
class First{
    void posNeg(int n){
        if(n>=0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        First fi =new First();
        fi.posNeg(n);

    }
}
