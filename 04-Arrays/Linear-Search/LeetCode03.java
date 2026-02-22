//1920. Build Array from Permutation
/*

Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

 

Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]

*/

import java.util.*;
public class LeetCode03 {
    public static int[] buildArray(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]+(nums[nums[i]]%nums.length)*nums.length;
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]/nums.length;
        // }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
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

        System.out.println(Arrays.toString(buildArray(arr)));
    }
}