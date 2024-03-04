package leetcode;

public class MergeSortedArray {
	
	public static void main(String[] args) {
		
		int nums1[] = {1,2,3,0,0,0}; //1,2,2,3,5,6
		int nums2[] = {2,5,6};
		int m=3;
		int n=3;
		merge(nums1,m,nums2,n);
		for(int k:nums1) {
			System.out.print(k);
		}
		
	}
	
	public static void merge(int nums1[], int m, int nums2[], int n) {
		int count =m+n-1;
		int i = m-1;
		int j = n-1;
		
	while(j>=0) {
		
		if(i>=0 && nums1[i] > nums2[j]) {
			nums1[count]=nums1[i];
			count--;
			i--;
		}else {
			nums1[count]=nums2[j];
			count--;
			j--;
		}
	}
		
	}

}
