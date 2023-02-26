package assignment02;

import java.util.Scanner;

public class ReverseTheString {
	public static void main(String[] args) {
		//declare an object for scanner class
		Scanner scan=new Scanner(System.in);
		//print the text
		System.out.println("enter the text");
		//declare a string and variable in order to store
		String text=scan.nextLine();
		//convert the string into character
		char[]ch=text.toCharArray();
		//iterate the loop
		for(int i=ch.length-1;i>=0;i--) {
			//print the character array
			System.out.println(ch[i]);
		}
	}

}
