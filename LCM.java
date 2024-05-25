import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int c = a*b;
        int i = 1;

        while(i<= c) {
            if(i%a == 0 && i%b == 0) {
                System.out.println("LCM OF BOTH THE NUMBERS IS :" + i);
                return;
            }
            i++;
        }
    }
}

