package DsaSOL;

import java.util.Scanner;

public class fact {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no   : ");
        int n = sc.nextInt();
        int  facto=1;  
        for(int i=1; i<=n; i++){
           
         facto *= i;
        }
        System.out.println(facto);
    }
    
}
