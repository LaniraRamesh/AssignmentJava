package assignment02;

public class Palindrome02 {
	public static void main(String[] args) {
		//declare the string
		String text="madam";
		//convert the string into character by toCharArray method
		char[]ch=text.toCharArray();
		//declare an empty string
		String rev="";
		//iterate the loop
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
			//provide the condition to check whether it matches and print it
			if(text.equals(rev)) {
				System.out.println("It is a Palindrome");
			}else {
				System.out.println("It is not a Plaindrome");
			}
		}
	}

}
