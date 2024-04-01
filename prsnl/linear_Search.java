package prsnl;

public class linear_Search {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,0,7,8,9};
        int n = arr.length;
        int key = 0;
        int index = search(arr,n,key);
        if(index == -1){
            System.out.println(key +" is not present.");
        }else{
            System.out.println(key+" is present at index "+ index);
        }
    }

    private static int search(int[] arr, int n, int key) {
        for(int i = 0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    
}
