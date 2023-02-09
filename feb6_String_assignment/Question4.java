package feb6_String_assignment;
//WAP to sort a String alphabetically

import java.util.Arrays;

public class Question4 {
	
	public static void main(String[] args) {
		
		//approach 1
		String str = "saaaaachin";
		char temp;
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(new String(arr));
		
		
		//approach 2
		String s = "rock";
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));
	}
	
}
