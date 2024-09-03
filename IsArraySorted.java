import java.util.Scanner;

public class IsArraySorted {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]> arr[i+1]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
