import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();//10
        System.out.println(factorial(n));
        fact(n);
    }
    public static int factorial(int n) {
        if(n==1 || n==0)
            return 1;
        else {
            return n*factorial(n-1);
        }
    }
    public  static void fact(int n) {
        int res=1;
        for(int i=2; i<=n; i++) {
            res= res*i;
        }
        System.out.println(res);

    }
}
