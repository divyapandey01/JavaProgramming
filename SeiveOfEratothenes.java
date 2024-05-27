import java.util.Scanner;

public class SeiveOfEratothenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=2; i<=n; i++) {
           findPrimeNumber(i);
        }
    }

    public static void findPrimeNumber(int k) {
        if(k==1) {
            return;
        }
        if(k==2 || k==3) {
            System.out.println(k);
            return;
        }
        if(k%2==0 || k%3==0) {
            return;
        }
        for(int j= 5; j*j<=k; j=j+6) {
            if(k%j==0){
                return;
            }
        }
        System.out.println(k);
    }
}
