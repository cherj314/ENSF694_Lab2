import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int count = 0;
		int i;
		System.out.print("Enter the elements in the array: ");
		while (count < num) {
			arr[count] = sc.nextInt();
			count++;
		}
		System.out.print("Enter the search key: ");
		int key = sc.nextInt();
		long start = System.nanoTime();
		for(i = 0; i < num; i++) {
			if (arr[i] == key) {
				System.out.println("Search key FOUND at index " + i + ".");
				break;
			}
			
		}
		if (i == num) {
			System.out.println("Search key NOT FOUND");
		}
		long end = System.nanoTime();
		long run = end - start;
		System.out.println("Run time is " + run + " Nanoseconds");
	}

}
