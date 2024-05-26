import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        int res = 0;
        int z =0;
        int k= 0;
        if(x>y) {
            z= y;
        } else {
            z = x;
        }
        for(int i=1 ; i<=z; i++) {
            if(x%i == 0 && y%i ==0) {
                k=i;
            }
        }
        System.out.println("Largest number divisible by both a and b is:" + k);
        EucleadianMethodForGCD();
    }
    public static void EucleadianMethodForGCD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number EGCD");
        int x = sc.nextInt();
        System.out.println("Enter second number EGCD");
        int y = sc.nextInt();

        while(x!= y) {
            if(x>y) {
                x = x-y;
            }
            if(y>x) {
                y = y-x;
            }
        }
        System.out.println("GCD of x and y is" + x);
    }
}
