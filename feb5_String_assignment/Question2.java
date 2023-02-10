package feb5_String_assignment;

import java.util.Scanner;

//WAP to print Duplicate characters from the String.
public class Question2 {

	public static void main(String[] args) {
		System.out.println("enter the string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] count = new int[256];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++ ;
		}
		for(int i=0;i<256;i++) {
			if(count[i]>1) {
				System.out.println("duplicate character -->> "+(char)(i));
			}
		}
		
	}

}
