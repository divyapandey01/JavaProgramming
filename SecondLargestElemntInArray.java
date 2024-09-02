import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElemntInArray {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.println("Enter a number");
            arr[i] = sc.nextInt();
        }
        int highest=-1, secHighest=-1;
        for(int i=0; i<n; i++) {
            if(arr[i]> highest){
                secHighest =highest;
                highest= arr[i];
            } else if (arr[i]> secHighest && arr[i] != highest) {
                secHighest = arr[i];
            }
        }
        System.out.println(secHighest+"is the second highest");
    }
}
