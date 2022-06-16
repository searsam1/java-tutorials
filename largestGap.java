import java.util.Arrays;

public class Stretches {

/*	largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 11
	// After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
	// Largest gap between 9 and 20 is 11
*/
	public static int largestGap(int[] arr) {
		Arrays.sort(arr);

		int gap = 0;
		for (int i=1; i<arr.length; i++){
			int ele2 = arr[i];
			int ele1 = arr[i-1];
			if (ele2 - ele1 > gap){
				gap = ele2 - ele1;
			}
		}
		return gap;
	}
	public static void main(String[] args) {
		System.out.println(largestGap( new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5} ));
	}
}