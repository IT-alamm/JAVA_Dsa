import java.util.Scanner;

public class LCM {

    public static int getLCM(int a, int b, int c){
        int lcm = 0;
        for(int i = 1;  ; i++){
            if(i%a==0 && i%b==0 && i%c==0){
                lcm = i;
                return lcm;
            }

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st no. : ");
        int x = sc.nextInt();

        System.out.println("Enter the 2nd no. : ");
        int y = sc.nextInt();

        System.out.println("Enter the 3rd no. : ");
        int z = sc.nextInt();



        
        int result = getLCM(x, y, z);
        System.out.println("LCM of "+ x + " , "+ y+ " and "+ z + " is : "+result);
        
    }
    
}
