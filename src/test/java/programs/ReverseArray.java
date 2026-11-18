package programs;

public class ReverseArray {
//Reverse array using for loop
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length;
		System.out.println("Original array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Reversed array:");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
