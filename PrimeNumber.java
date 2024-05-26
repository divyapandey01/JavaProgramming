import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        for(int i = 2; i<a ; i++) {
            if(a%i == 0) {
                System.out.println(a+ " is a not prime number");
                return;
            }
        }
        System.out.println(a+ " is a prime number");
//efficient method----

        for(int i= 2; i*i<=a; i++) {
            if(a%i == 0) {
                System.out.println(a+ " is a not prime number");
                return;
            }
        }
        System.out.println(a+ " is a prime number");
//More efficient method-----
        if(a ==1) {
            System.out.println(a+"is not a prime number");
            return;
        }
        if(a==2 || a==3) {
            System.out.println(a+"is a prime number");
            return;
        }
        if(a%2==0 || a%3==0) {
            System.out.println(a+"is not a prime number");
            return;
        }
        for(int i = 5; i<a; i=i+6) {
                if(a%i == 0) {
                    System.out.println(a+"is not a prime number");
                    return;
                }
        }
        System.out.println(a+" is a prime number");
    }

}
