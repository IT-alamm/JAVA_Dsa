package Array;

public class search {
    public class Search {
    


        public static int LinrSearch(int numbers[], int key){
            for(int i=0; i<numbers.length; i++){
                if(numbers[i] == key){
                    return i;
    
                }
    
    
            }
            return -1;
    
        }
    
        public static void main(String[] args) {
            int numbers[] = {5, 34, 64, 15, 13, 55,10}; 
            int key = 13;
            int index = LinrSearch(numbers, key);
            if(index == -1){
                System.out.println("not found");
            } else {
                System.out.println("found");
            }
        }
    }
}
