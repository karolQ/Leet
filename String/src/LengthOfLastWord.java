//method 1: using split
public class LengthOfLastWord{
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

/*
// method 2

public int LengthOfLastWord(String s){
	if(s == null || s.length() == 0)
		return 0;
	int i = s.length()-1;
	int count = 0;
	while(i >=0 && s.charAt(i) == ' ')
		i--;
	for(; i >= 0; i--){
		if(s.charAt(i) != ' ')
			count++;
		else
			break;
	}
	return count;ß
}
*/
