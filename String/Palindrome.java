
import java.util.Scanner;

public class Palindrome {
    
    public static boolean isPalondrome(String str){
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) == str.charAt(n - i - 1)){
                // not a palindrome
                return true;
            }    
        }
        return false;
        // int n =121;
        // for(int i = 0; i<2;i++){
        //     if(n/100==n%10){
        //         return true;
        //     }
        // }
        // return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.next();
        // String str = "ada";
        System.out.println(isPalondrome(str));
    }
}
