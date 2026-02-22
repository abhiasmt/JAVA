//1480. Running Sum of 1d Array

/*

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

*/

import java.util.Scanner;

public class LeetCode04 {
    public static int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        System.out.println("Enter the size :");
        int sz = in.nextInt();

        int[] arr =new int[sz];

        System.out.println("Enter the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
