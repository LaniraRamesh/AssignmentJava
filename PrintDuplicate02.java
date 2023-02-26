package assignment02;

import java.util.Arrays;

public class PrintDuplicate02 {
public static void main(String[] args) {
	//declare an int array
	int[] num= {11,22,33,44,55,66,22,77,11};
	//sort the array in ascending ordere
	Arrays.sort(num);
	//iterate the nested for loop
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			//declare a condition
			if(num[i]==num[j]) {
				//print the statement
			System.out.println(num[j]);	
			}
		}
	}
	}
}
