import java.util.Arrays;

public class reverseArr1 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 11};
        int i=0, j=arr.length-1, temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;


        }
        System.out.println("array is : "+Arrays.toString(arr));
    }
}
