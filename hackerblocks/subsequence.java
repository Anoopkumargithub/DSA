package hackerblocks;

public class subsequence {
    static int count;
    public static void main(String[] args) {
        String s1 = "abcd";
        String s = "";
        sub(s1, s);
        System.out.println(count);
    }

    public static void sub(String abc, String b) {
        if(abc.isEmpty()){
            System.out.println(b);
            count++;
            return;
        }
        char ch =  abc.charAt(0);
        sub(abc.substring(1),b);
        sub(abc.substring(1),b+ch);
    }
}
