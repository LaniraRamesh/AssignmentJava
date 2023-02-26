package assignment02;

import java.util.Arrays;

public class PrintDuplicate02 {
public static void main(String[] args) {
	int[] num= {11,22,33,44,55,66,22,77,11};
	Arrays.sort(num);
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			if(num[i]==num[j]) {
			System.out.println(num[j]);	
			}
		}
	}
	}
}
