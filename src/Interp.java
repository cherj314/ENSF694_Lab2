import java.util.Scanner;
import java.util.Arrays;

public class Interp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int count = 0;
		System.out.print("Enter the elements in the array: ");
		while (count < num) {
			arr[count] = sc.nextInt();
			count++;
		}
		System.out.print("Enter the search key: ");
		int key = sc.nextInt();
		long start = System.nanoTime();
		int low = 0;
		Arrays.sort(arr);
		int high = num - 1;
		while (key >= arr[low] && key <= arr[high] && low <= high) {
			int probe = low + ((high - low) * (key - arr[low]) / (arr[high] - arr[low]));
			if (high == low) {
				if (arr[low] == key) {
					System.out.println("Search key FOUND at index " + low + ".");
					break;
				}
				else {
					System.out.println("Search key NOT FOUND");
					break;
				}
			}
			if (arr[probe] == key) {
				System.out.println("Search key FOUND at index " + probe + ".");
				break;
			}
			if (arr[probe] < key) {
				low = probe + 1;
			}
			else {
				high = probe - 1;
			}
		}
		long end = System.nanoTime();
		long run = end - start;
		System.out.println("Run time is " + run + " Nanoseconds");
	}
}
