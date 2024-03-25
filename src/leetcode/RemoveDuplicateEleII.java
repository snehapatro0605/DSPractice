package leetcode;

public class RemoveDuplicateEleII {
	public static int removeDuplicatesFromSortedArray(int [] nums) {
		int i = 0;
		for(int n:nums) {
			if(i<2 || n != nums[i-2]) {
				nums[i++]=n;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int arr[] = {0,0,1,1,1,1,2,2,2,3};
		int out = removeDuplicatesFromSortedArray(arr);
		System.out.println(out);
	}
}
