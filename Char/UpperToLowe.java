// 

import java.util.Scanner;

public class UpperToLowe {

    public static char upperToLower(char ch){
        
        char ch1 = Character.toLowerCase(ch);
       return ch1 ;
 
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  char : ");
        char ch = sc.next().charAt(0);
        System.out.println(upperToLower(ch));




        
       
     }
    
}
