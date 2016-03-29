
public class LengthOfLastWord {
	public static int lengthOfLastWord(String s){	
		if (s == null || s.length() == 0)
			return 0;
		int count = 0;
		int i = s.length() - 1;
		while(i >= 0 && s.charAt(i) == ' ') 
			i--;         
		for (; i >= 0; i--) {
		if(s.charAt(i) != ' ') 
			count++;
		else break;
		}
	return count;
   }
	
public static void main(String[] args) {
	String s1 = " ";
	String s2 = "a ";
	String s3 = "Hello world";
	System.out.println(lengthOfLastWord(s1));
	System.out.println(lengthOfLastWord(s2));
	System.out.println(lengthOfLastWord(s3));
	}
}
