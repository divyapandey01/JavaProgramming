import java.util.Scanner;

public class DeleteOperationArray {
    public static void main(String[] args) {
//        int [] arr = new int[5];
        int [] arr = {1, 2, 5, 7, 11};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be deleted:");
        int x = sc.nextInt();
        int pos;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == x) {
                pos = i;
                for(int j= pos; j<arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
            }
        }
        for(int i=0;i< arr.length-1;i++)
            System.out.println(arr[i]);
    }
}
