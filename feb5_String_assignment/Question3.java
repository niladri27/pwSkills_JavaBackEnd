package feb5_String_assignment;
// WAP to check if "2552" is palindrome or not. 
public class Question3 {

	private static void checkPalindrome(String str) {
		String stnew = "";
		for(int i=str.length()-1;i>=0;i--) {
			stnew = stnew+ str.charAt(i);
		}
		if(stnew.equals(str)) {
			System.out.println(str + " is palindrome");
		}else
			System.out.println(str+ " not a palindrome");
	}
	public static void main(String[] args) {
		checkPalindrome("2552");
	}
}
