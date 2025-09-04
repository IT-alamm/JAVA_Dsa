// package Array;

public class reverseArr {
    public static void reverseArr(int number[]){
        int first = 0; int last = number.length-1;

        while(first < last){
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;
            first++;
            last--;
           
        }
    }
    public static void printArray(int number[]){
        for(int i = 0; i<number.length; i++){
            System.out.print(number[i] +"  ");
         }
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 5, 3, 2, 1};

       
         reverseArr(number);
         printArray(number);
         

    
       
        
    }
}
