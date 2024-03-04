package leetcode;

public class RemoveElement {
	
public static void main(String[] args) {
		
		int nums[] = {3,2,2,3}; 
		int val=3;
		int n=3;
		int c = remove(nums,val);	
		System.out.println(c);
		
	}

	public static int remove(int[] nums, int val) {
		int count = 0;
		for(int i=0;i < nums.length; i++) {
			if(nums[i] == val) {
				continue;
			}else {
				nums[count]=nums[i];
				count++;
			}
		}	
		return count;
	}
}
