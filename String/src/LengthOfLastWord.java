
public class LengthOfLastWord {
	public static int lengthOfLastWord(String s){	
		String[] str = s.split(" ");
		return (str.length == 0) ? 0 : str[str.length-1].length();
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
