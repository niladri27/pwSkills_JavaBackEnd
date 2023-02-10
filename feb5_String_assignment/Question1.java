package feb5_String_assignment;
// WAP to remove duplicates from a String.
public class Question1 {

	private static void removeDuplicates(String str) {
		
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			boolean repeated = false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repeated=true;
					break;
				}
			}
			if(!repeated) {
				sb.append(arr[i]);
			}
		}
		System.out.println("after removing duplicate characters -->>"+sb);
	}
	
	public static void main(String[] args) {
		removeDuplicates("ananya");
	}
}
