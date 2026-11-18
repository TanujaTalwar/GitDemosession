package programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("Reversed string using StringBuilder: " + sb.toString());

		// using char array
		char[] charArray = str.toCharArray();
		String reversedStr = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			reversedStr += charArray[i];
		}
		System.out.println("Reversed string using char array: " + reversedStr);

		
	}

}
