package assignment02;

public class CharacterOccurance {
	public static void main(String[] args) {
		//Declare a String
		String text="testleaf";
		//convert the string to character by toCharArray method
		char[] ch=text.toCharArray();
		//initialize a count variable with int as datatype
		int count=0;
		//iterate the loop
		for(int i=0;i<ch.length;i++) {
			//declare a condition to check the 'e' occurence and increase the count
			if(ch[i]=='e') {
				count++;
			}
			//Print the count
			System.out.println("e occurence is :"+count);
			
			}
		}
		
	}


