import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();//123 n=1// 12 n=2
        int n =0;
        if(a==0) {
            n=1;
        }
        while(a >0) {
            a= a/10;
           n++;
        }
        System.out.println("no of digits in the given number:" + n);
    }
}
//Note: Time complexity of this code is: O(N)
