// package Array2D;

public class DiagonalSum {

public static int diagonalSum(int matrix[][])
{
    int sum = 0;
    for(int i = 0; i<matrix.length; i++){
        // pd : Primary diaonal 
        sum += matrix[i][i];  

        // sd : secondary diagional 

        sum += matrix[i][matrix.length-1-i];


    }
    return sum;

}

    public static void main(String[] args) {
        int matrix [][] ={{2, 4, 6, 7,},
                          {1, 3, 4, 1,},
                          {2, 4, 6, 7,},
                          {1, 3, 4, 1,}, };
         System.out.println("Diagonal sum is : "+diagonalSum(matrix));
                                        
    }
    
}
