import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]) {
        //121, 76567
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a no");
        int n = sc.nextInt();
        int b= n;
        int sum=0;
        while(b>0) {
            sum = sum*10 + (b%10);
            b= b/10;
        }
        if(n==sum) {
            System.out.println(n +" is a palindrome");
        }
        else {
            System.out.println(n+ " is not a palindrome");
        }

    }
}
