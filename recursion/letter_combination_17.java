package recursion;
//leetcode
public class letter_combination_17 {
    static String [] arr = { "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String digit = "23";
        comb(digit,arr,"");
    }
    private static void comb(String digit, String[] arr, String ans) {
        if(digit.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = digit.charAt(0);
        int k = ch-48;
        String ques = arr[k-1];
        for(int i = 0;i<ques.length();i++){
            comb(digit.substring(1),arr,ans+ques.charAt(i));
        }
        // throw new UnsupportedOperationException("Unimplemented method 'climb'");
    }
}