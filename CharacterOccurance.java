package assignment02;

public class CharacterOccurance {
	public static void main(String[] args) {
		String text="testleaf";
		char[] ch=text.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='e') {
				count++;
			}
			System.out.println("e occurence is :"+count);
			
			}
		}
		
	}


