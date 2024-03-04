package com.topic.Arrays;

import java.util.Arrays;
import java.util.*;



public class SubArrayWithGivenSum {
	
	static List<Integer>
    subarrayWithGivenSum(List<Integer> arr, int targetSum)
    {
        int sum = 0;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
 
            // Find the sum
            sum += arr.get(i);
            if (sum == targetSum) {
                return arr.subList(0, i + 1);
            }
            System.out.println("Diff"+(sum-targetSum));
            System.out.println("indexOf:"+arr.indexOf(sum-targetSum));
            if (s.contains(sum - targetSum)) {
                int start
                    = arr.indexOf(sum - targetSum) + 1;
                System.out.println("Difference "+ (sum-targetSum));
                return arr.subList(start, i + 1);
            }
            s.add(sum);
            System.out.println(s);
        }
        return new ArrayList<>();
    }
	
	public static void main(String[] args)
    {
        //List<Integer> arr = Arrays.asList(15, 2, 4, 8, 9, 5, 10, 23);
		List<Integer> arr
        = Arrays.asList(1,2,3,4,5);
        List<Integer> subarray
            = subarrayWithGivenSum(arr, 12);
        if (subarray.isEmpty()) {
            System.out.println(
                "No subarray with given sum found");
        }
        else {
            System.out.print("Subarray: [ ");
            for (int i : subarray) {
                System.out.print(i + " ");
            }
            System.out.println("]");
        }
    }

}
