package recursion;

public class subsequence {
    public static void main(String[] args) {
        String s1 = "abc";
        String s = "";
        sub(s1, s);
    }

    public static void sub(String abc, String b) {
        if(abc.isEmpty()){
            System.out.println(b);
            return;
        }
        char ch =  abc.charAt(0);
        sub(abc.substring(1),b);
        sub(abc.substring(1),b+ch);
    }
}
