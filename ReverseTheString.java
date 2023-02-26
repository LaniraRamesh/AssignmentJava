package assignment02;

import java.util.Scanner;

public class ReverseTheString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the text");
		String text=scan.nextLine();
		char[]ch=text.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}

}
