package assignment02;

public class Palindrome02 {
	public static void main(String[] args) {
		String text="madam";
		char[]ch=text.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
			if(text.equals(rev)) {
				System.out.println("It is a Palindrome");
			}else {
				System.out.println("It is not a Plaindrome");
			}
		}
	}

}
