import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = a.nextInt();
        System.out.println("Enter second number");
        int y = b.nextInt();
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
        GreatestCommonDivisor gd = new GreatestCommonDivisor();
        gd.EucleadianMethodForGCD();
    }
    public void EucleadianMethodForGCD() {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("Enter first number EGCD");
        int x = a.nextInt();
        System.out.println("Enter second number EGCD");
        int y = b.nextInt();

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
