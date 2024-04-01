package recursion;

public class permitaioninstr {
	public static void main(String[] args) {
		String st = "aba";
		print(st, "");

	}

	private static void print(String st, String ans) {
		if (ans.length() == 3) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			boolean flag = false;
			for (int j = i + 1; j < st.length(); j++) {
				if (ch == st.charAt(j)) {
					flag = true;
				}
			}
			if (flag == false)
				print(st.substring(0, i) + st.substring(i + 1), ans + st.charAt(i));
		}

	}

}
