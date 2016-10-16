
public class CountAndSay {
	public static void main(String[] args){
		int n1 = 0, n2 = 3, n3 = 10;
		System.out.println(countAndSay(n1));
		System.out.println(countAndSay(n2));
		System.out.println(countAndSay(n3));
	}

	public static String countAndSay(int n){
		if (n<=0)
			return "";
		StringBuilder curr = new StringBuilder("1");
		StringBuilder prev;
		int count = 0;
		char say;
		for (int i = 0; i < n; i ++){
			prev = curr;
			curr = new StringBuilder();
			count = 1;
			say = prev.charAt(0);

			for (int j = 1; j < prev.length(); j++){
				if(prev.charAt(j) != say){
					curr.append(count).append(say);
					count = 1;
					say = prev.charAt(j);
				}
				else count++;
			}
			curr.append(count).append(say);
		}
		return curr.toString();
	}
}
