package feb5_String_assignment;
// WAP to find the maximum occurring character in a string
public class Question8 {

	public static void main(String[] args) {
	
		String s = "abssccccc";
		int[] arr = new int[127];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)]+1 ;
		}
		int max = -1;
		char c = ' ';
		for(int i=0; i<s.length() ;i++) {
			if(max<arr[s.charAt(i)]) {
				max = arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println("maximum occuring character is: " + c);
	}
	
}
