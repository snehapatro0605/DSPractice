package leetcode;

public class MajorityElement {
	//Moore's Voting Algorithm
	public static int majorityElement(int[] nums) {
		int points = 0;
		int cand = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(points == 0) {
				//current ele is the candidate
				cand=nums[i];
			}else if(cand == nums[i]) {
				//inc points for the current candidate
				points++;
			}else {
				//dec points if other ele apart from current candidate is encountered
				points--;
			}
		}
		return cand;
	}
	public static void main(String[] args) {
		int arr[] = {2,2,1,1,1,2,2};
		int out = majorityElement(arr);
		System.out.println(out);
	}
}
