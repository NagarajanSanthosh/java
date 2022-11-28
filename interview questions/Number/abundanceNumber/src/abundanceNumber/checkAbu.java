package abundanceNumber;

public class checkAbu {
    int abu(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum>n)
            System.out.println("Abundance number");
        else
            System.out.println("not an abundance number");
        return 0;
    }
}
