import java.util.ArrayList;

public class ReverseAnArray {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(3);
        int n= arr.size();
        for(int i=0; i< arr.size()/2; i++) {
           int k=arr.get(i);
           arr.set(i, arr.get(n-i-1));
           arr.set(n-i-1, k);
        }
        System.out.println(arr);
    }
}
