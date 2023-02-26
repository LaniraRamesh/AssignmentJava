package assignment02;

import java.util.Arrays;

public class MissingElement02 {
public static void main(String[] args) {
	//Declare an array with variable name as num
	int[] num= {2,5,6,8,9,1,3,4};
	//Sort the Array in ascending order using sort method
	Arrays.sort(num);
	//intialize a variable with datatype as int
	int j=0;
	//iterate the loop
	for(int i=0;i<num.length;i++) {
		j=i+1;
		//declare the condition
		if(num[i]!=j) {
			System.out.println(j);
			break;
		}
	}
}
}
