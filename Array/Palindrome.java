
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //  For user input by manuallay 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element  : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
       System.out.println("Enter the element of an array ");
        for( int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
       }
      boolean IsPalindrome = true;
        for(int i=0; i<arr.length /2; i++){
            if(arr[i] != arr[arr.length - 1 - i]){
                IsPalindrome=false;
                break;
           }
        }
       // for defind value 
        // int arr[] = {2, 4, 3, 3, 5, 2};
        // boolean IsPalindrome = true;
        // for(int i=0; i<arr.length /2; i++){
        //     if(arr[i] != arr[arr.length - 1 - i]){
        //         IsPalindrome=false;
        //         break;
        //     }
        // }
        if(IsPalindrome){
            System.out.println(" the array is palidrome : ");
        }
        else{
            System.out.println("is not palinrome");
        }


    }
}
