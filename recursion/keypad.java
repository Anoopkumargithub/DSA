package recursion;
import java.util.Scanner;

public class keypad {
    static String [] key = {"",".+@$", "abc","def", "ghi","jkl","mno","pqrs","tuv","wxyz"};
    static String[] ser = {"kartik","sneha","deepak","shikha","palak","utkarsh","divyam","vidhi","sparsh","akku"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // ArrayList<String> list = new ArrayList<String>();
        // printwords(str,"",list);
        // System.out.println(list);
        // for(int i = 1;i<list.size();i++){
        //     String ch = list.get(i);
        //     String sea = searchin[i];
        //     search(sea,ch);
            
        // }
        letter(str,"");
        sc.close();
    }
    static void letter(String st,String ans){
        if(st.length()==0) {
			for(int i=0;i<ser.length;i++) {
				if(ser[i].contains(ans)) {
					System.out.println(ser[i]);
				}
			}
			return;
		}
		char ch=st.charAt(0);
		String q=key[(ch-48)];
		for (int i = 0; i < q.length(); i++) {
			letter(st.substring(1),ans+q.charAt(i));
			//print(digit.substring(1),arr,ans+q.charAt(i));
}
    }
}








    // private static void letter( String string) {
    //     for(int i = 1;i< searchin.length;i++){
    //         if(searchin[i].contains())
    //     }
    // }
    // // private static void search(String sea,String ch ) {
    // //     for(int i =0;i<ch.length();i++){
    // //         for(int j = 0;j<sea.length();j++){
    // //             if(ch.charAt(i) == sea.charAt(j)){
    // //                 System.out.println(sea);
                    
    // //             }
    // //         }
    // //     }
    // // }





//     static void printwords(String digits, String current, ArrayList<String> list){
//         if(digits.length()==0){
//             list.add(current);
//             return;
//         }
//         int digit = digits.charAt(0) - '0';
//         String letters = key[digit];
//         for(int i=0;i<letters.length();i++){
//             printwords(digits.substring(1),current+letters.charAt(i),list);
//         }
//     }
// }
