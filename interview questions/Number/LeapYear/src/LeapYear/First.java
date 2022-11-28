package LeapYear;

public class First {
    void leap(int n){
        if((n%4==0)&&(n%400==0)||(n%100!=0)){
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not a leap year");
    }
}
