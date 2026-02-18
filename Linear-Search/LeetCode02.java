//1672. Richest Customer Wealth


/*

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

 

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

*/

import java.util.Scanner;

public class LeetCode02 {
    public static int maximumWealth(int[][] accounts) {
        int MaxRow=Integer.MIN_VALUE;
        for(int row=0;row<accounts.length;row++){
            int RowSum=0;
            for(int col=0;col<accounts[row].length;col++){
                RowSum+=accounts[row][col];
            }
            if(MaxRow<RowSum){
                MaxRow=RowSum;
            }
        }
        return MaxRow;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];

        System.out.println("Enter the account wealth : ");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }

        System.out.println(maximumWealth(arr));


        
    }
}
