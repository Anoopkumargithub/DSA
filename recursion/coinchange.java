package recursion;
// leetcode
public class coinchange {
    static int k = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int amount = 11;
        coin(arr,amount,"");
        System.out.println(k);

    }  private static void coin(int[] arr, int amount,String ans) {
        if(amount ==0  ){
            // System.out.println(ans);
            if(ans.length()<k){
                k =ans.length() ;
            }

            return;        
        }
        if(amount<0){
            return;
        }
        for(int i = 0;i<arr.length;i++){
            coin(arr,amount-arr[i],ans+arr[i]);
        }
    }
}
