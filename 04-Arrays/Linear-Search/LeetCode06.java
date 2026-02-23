//1431. Kids With the Greatest Number of Candies

/*

There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

 

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode06 {
    public static List<Boolean> kidsWithCandies(int[] ar, int exCan) {
        
        List<Boolean> result = new ArrayList<>();

        int max=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }

        for(int i=0;i<ar.length;i++){
            if(ar[i]+exCan>max){
                result.add(true);
            }else if(ar[i]+exCan==max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
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
        System.out.println("Enter the n :");
        int n = in.nextInt();

        List<Boolean> ans=kidsWithCandies(arr, n);
        System.out.println("The result is :");
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        
    }
}

