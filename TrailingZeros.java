import java.math.BigInteger;
import java.util.Scanner;

public class TrailingZeros extends EfficientMethodTrailingZeros{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int n= sc.nextInt();
        BigInteger res= BigInteger.ONE;
        for(int i=1; i<=n; i++){
            res= res.multiply(BigInteger.valueOf(i));
        }
        System.out.println("factorial of number "+ n + " is " + res);
        int t=0;
        BigInteger ten = BigInteger.TEN;
        while(res.mod(ten).equals(BigInteger.ZERO)) {
                t++;
                res = res.divide(BigInteger.TEN);

        }
        System.out.println("no of trailing zero in " + n + " is " + t);
        EfficientMethodTrailingZeros efficientMethodTrailingZeros = new EfficientMethodTrailingZeros();
        efficientMethodTrailingZeros.EffTrailIngZeros();
    }
}

class EfficientMethodTrailingZeros {
    public void EffTrailIngZeros() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int res = 0;
    for(int i = 5; i<=n ; i = i*5) {
        res = res + n/i;
    }
        System.out.println("Number of trailing zeros in n is: "+ res);
}
}
