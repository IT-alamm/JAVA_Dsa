// package Function;

// public class revise {
//     public static void calculateSum(int num1, int num2){
//                 // Scanner Sc = new Scanner(System.in);
//                 // int a = Sc.nextInt();
//                 // int b = Sc.nextInt();
//                 int Sum = num1 + num2;
//                 System.out.println(Sum);
        
//             }
//             public static void main(String[] args) {
//                 Scanner Sc = new Scanner(System.in);
//                 int a = Sc.nextInt();
//                 int b = Sc.nextInt();
//                 calculateSum(a,b);
//             }
//         }
        
     
//         public class revise {
        
//             public static void main(String[] args) {
//                 System.out.println("helo");
//             }
//         }
        
//         swap 
//         package function;
        
//         public class revise {
        
//             public static void main(String[] args) {
//                 int a =6;
//                 int b=5;
                 
//                 // swap
//                 int temp=a;
//                 a=b;
//                 b=temp;
//                 System.out.println("a: " + a);
//                 System.out.println("b: " +b);
//             }
//         }
        
        
        
//         Product of twom no 
        
//         package function;
        
//         public class revise {
        
//             public static int MultiplyTwo(int a, int b){
//                 int product = a*b;
//                 return product;
        
//             }
//             public static void main(String[] args) {
//                 int a=5;
//                 int b=6;
//                System.out.println(MultiplyTwo(a, b)); 
//             }
//         }
        
        
        
//         factorial
        
//         package function;
        
//         public class revise {
        
//             public static int factorial(int n){
//                 int fact = 1;
//                 for (int i = 1; i <= n; i++) {
//                     fact = fact*i;
//                 }
//                 return fact;
        
//             }
//             public static void main(String[] args) {
//                 // System.out.println( factorial(10));
//                 int Factorial =  factorial(8);
//                 System.out.println(Factorial);
//             }
//         }
        
        
//         Binomial coefficient 
        
//         package function;
        
//         public class revise {
        
//             public static int factorial(int n){
//                 int fact = 1;
//                 for (int i = 1; i <= n; i++) {
//                     fact = fact*i;
//                 }
//                 return fact;
        
//             }
             
//             public static int binCoeffi(int n, int r){
//                 int fac_n = factorial(n);
//                 int fac_r = factorial(r);
//                 int fac_nmr = factorial(n-r);
//                 int BinCoeffi = fac_n / (fac_r * fac_nmr);
//                 return BinCoeffi;
        
        
        
//             }
//             public static void main(String[] args) {
//                 // System.out.println( factorial(10));
//                 // int Factorial =  factorial(8);
//                 // System.out.println(Factorial);
//                int coeff = binCoeffi(5,2);
//                System.out.println(coeff);
        
//             }
//         }
        
        
//          Function overloading means a class has multiple function with the same name but differnt parameter
        
//         package function;
        
//         public class revise {
        
//             public static int sum(int a, int b){
//                 return a+b;
        
//             }
//             public static float sum(float a, float b){
//                 return a+b;
//             }
//             public static void main(String[] args) {
//                 System.out.println(sum(44, 44));
//                 System.out.println(sum(3.4f, 5.2f));
//             }
//         }
        
        
       
        
        
//         // import java.util.Scanner;
        
//         // public class revise {
        
//             public static boolean isPrime(int n){
//                 boolean isPrime = true;
//                 for(int i=2; i<=n-1; i++){
//                     if(n % i == 0){
//                         isPrime = false;
//                         break;
//                     }
//                 }
//                 return isPrime;
        
        
//                 // optimizes way 
//                 for(int i=2; i<=n-1; i++){
//                     if(n%i==0){
//                         return false;
        
//                     }
                    
//                 }
//                 return true;
        
        
//                 // other optimize way 
//                    if(n==2){
//                     return true;
//                    }
        
//                 for(int i=2; i<=Math.sqrt(n); i++){
//                     if(n%i==0){
//                         return false;
        
//                     }
//                 }
//                 return true;
        
//             }
        
        
//             public static void main(String[] args) {
//                 Scanner Sc = new Scanner(System.in);
//                 int n = Sc.nextInt();
//                 System.out.println(isPrime(n));
//             }
// // }
