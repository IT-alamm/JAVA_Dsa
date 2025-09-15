// package Array;

public class prefixSubbArrSum {

public static void preFixSubbArraySum(int number[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[number.length];

    prefix[0] = number[0];

    // calcute prefix array
    for(int k = 1; k<prefix.length; k++){
        prefix[k] = prefix[k-1] + number[k];

    }
    for(int i = 0; i<number.length; i++){
        int start = i;
        for(int j = i; j<number.length; j++){
            int end = j;

            currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            if(maxSum < currSum){
                maxSum = currSum;

            }
        }
    }
    System.out.println("Prefix max sub arrary : " + maxSum);
}
    public static void main(String[] args) {
        int number[] = {1, -2, 3, 4, -2 , 5};
       preFixSubbArraySum(number);
    }
    
}
