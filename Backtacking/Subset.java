public class Subset {


    public static void findSubSet(String str, int i, String ans){
        // base case
        if(i == str.length()){
            if(i == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        // recurson
        // yes

        findSubSet(str, i+1, ans+str.charAt(i));

        // no

        findSubSet(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubSet(str, 0, "");
    }
}
