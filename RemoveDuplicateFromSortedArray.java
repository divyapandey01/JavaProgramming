import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
    public static void main(String [] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("input size");
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = RemoveDuplicate(arr, n);
        System.out.println("size of new resultant array is"+ res);
        for(int i=0;i<res;i++){
            System.out.println(arr[i]);
        }
    }
    public static int RemoveDuplicate(int[] arr, int n) {
        int res=1;
        for(int i=1; i<n;i++) {
            if(arr[i]!=arr[res-1]){
                arr[res]= arr[i];
                res++;
            }
        }
        return res;
    }
}
