package in.kunal;

public class Second_Largest_Element {

	static int secondlargest(int arr[]) {

		int first = Integer.MIN_VALUE;

		int second = Integer.MIN_VALUE;

		int n = arr.length;

		for (int num : arr)
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num < first) {
				second = num;

			}
		return second == Integer.MIN_VALUE ? -1 : second;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 12, 15 };
		int secondlargest = secondlargest(arr);
		System.out.println(secondlargest);
	}
}
