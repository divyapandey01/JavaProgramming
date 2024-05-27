import java.util.Scanner;

public class AllDivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Divisors of n are:");
        for(int i=1; i<=n ; i++) {
            if(n%i== 0) {
                System.out.println(i);
            }
        }
        int i;
//EfficientMethod:
        System.out.println("efficient method to print all the divisors:");
        for(i=1; i*i<n; i++) {//1to root
            if(n%i == 0) {
                System.out.println(i);
            }
        }
        for(int j=i; j>=1; j--) {// root to 1
            if(n%j==0) {
                System.out.println(n/j);
            }
        }
    }
}
