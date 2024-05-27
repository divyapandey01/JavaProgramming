import java.util.Scanner;

public class ComputingPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter power");
        int n = sc.nextInt();
        int res = 1;
        for(int i = 1; i<=n; i++) {
            res = a*res;
        }
        System.out.println("Power of number is:" + res);

    }
}
