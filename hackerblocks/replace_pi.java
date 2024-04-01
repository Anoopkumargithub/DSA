package hackerblocks;
import java.util.Scanner;

public class replace_pi {
    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
	        // int n = sc.nextInt();
	        // for (int i = 0;i<=n;i++) {
	        String s=sc.nextLine();
	        String res=replace(s);
	        System.out.println(res);
	        // }
            sc.close();

	    }
private static String replace(String s)
{
    if(!s.contains("pi"))
    {
        return s;
    }
    int index=s.indexOf("pi");
    String replace=s.substring(0,index)+"3.14"+replace(s.substring(index+2));
    return replace;
}
}
