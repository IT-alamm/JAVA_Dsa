public class SortedOrNot {
    public static boolean isSotred(int arr[], int i){
        if(i == arr.length-1){
            return true;

        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSotred(arr, i+1);
    }

   public static void main(String[] args) {

    int arr[] = {1,4,6,11,9};
    System.out.println(isSotred(arr, 0));

    
   } 
}
