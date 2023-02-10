package feb5_String_assignment;

import java.util.Arrays;

//WAP to implement Anagram checking least inbuilt methods being used.
public class Question5 {
	
	private static void checkAnagram(String s1, String s2) {
		s1=s1.replace(" ", "");
		s1=s1.toLowerCase();
		s2=s2.replace(" ", "");
		s2=s2.toLowerCase();
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("is Anagram");
		}else
			System.out.println("not anagram");
	}
	
	public static void main(String[] args) {
//		checkAnagram("ScHool master", "the ClasS Room");
		checkAnagram("school", "BUS");
		
	}
}
