package feb6_String_assignment;
//WAP to reverse a sentence while preserving the position 
public class Question3 {

	private static void reverse(String str) {
		
		str=str.toLowerCase();
		String arr[] = str.split(" ");
		for(String s:arr) {
			for(int i=s.length()-1;i>=0;i--) {
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		reverse("Think Twice");
	}
}
