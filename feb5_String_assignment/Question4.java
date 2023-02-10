package feb5_String_assignment;

import java.util.Scanner;

//WAP to count the number of consonants, vowels, special characters in a string.
public class Question4 {
	
	public static void main(String[] args) {
		String str;
		System.out.println("Enter the line of String: ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		str=str.toLowerCase();
		int v=0,c=0,spcl=0;
		
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
					v++;
				}else
					c++;
			}else {
				spcl++;
			}
		}
		
		System.out.println("total vowels are: "+v);
		System.out.println("total consonents are: "+c);
		System.out.println("total special characters are: "+spcl);
	}
}
