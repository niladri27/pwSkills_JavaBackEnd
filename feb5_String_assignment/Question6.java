package feb5_String_assignment;
//WAP to implement Pangram checking with the least inbuilt methods being used.
public class Question6 {

	private static boolean checkPangram(String str) {
	
		str=str.replace(" ", "");
		str=str.toUpperCase();
		char ch[]=str.toCharArray();
		int arr[]=new int[26];
		for(int i=0;i<ch.length;i++) {
			arr[ch[i]-65]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println("given string is not a Pangram");
				return true;
			}
		}
		System.out.println("given string is a Pangram");
		return false;
	}
	
	public static void main(String[] args) {
		checkPangram("the quick brown fox jumps over lazy dog");
//		checkPangram("horse is an animal");
	}
}
