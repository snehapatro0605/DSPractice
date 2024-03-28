package leetcode;

import java.util.HashMap;

public class TwoSum {
	
	public static int[] twoSum(int[] num, int target) {
		HashMap<Integer,Integer> hmap = new HashMap<>();
		
		for(int i=0;i<num.length;i++) {
			int res_sum = target - num[i];
			if(hmap.containsKey(res_sum)) {
				int [] res_arr = {hmap.get(res_sum),i};
				return res_arr;
				}
			hmap.put(num[i], i);
			}
	return null;
	}
	
	public static void main(String[] args) {
		//int arr[] = {2,7,11,15};
		int arr[] = {3,2,4};
		//int target = 9;
		int target = 6;
		int[] out = twoSum(arr,target);
		
		for(int i=0;i<out.length;i++) {
			System.out.print(out[i]+" ,");
		}
		
	}

}
