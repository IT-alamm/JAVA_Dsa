public class ArraySort {

    // public static void  Sorted(int arr[]){
    //     boolean isSorted = true;
    //     for(int i = 0; i < arr.length - 1 ; i++){
    //         if(arr[i] > arr[i+1]){
    //             isSorted = false;
    //             // break;
    //         } 
    //     }
    //     if(isSorted == true){
    //         System.out.println("Array is  sorted");
    //     }else{
    //         System.out.println("Array is not sorted ");
    //     }
    // }
    public static boolean sortedOrNot(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void sortedArr(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    

   public static void main(String[] args) {
    //  int arr[] = {1, 3, 5, 9, 8, 9};
    //  System.out.println(sortedOrNot(arr));

    int arr[] = {4,2,8,6,5};
    sortedArr(arr);
    printArr(arr);
   } 
}





