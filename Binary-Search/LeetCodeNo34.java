
import java.util.*;
public class LeetCodeNo34 {
    public static int[] searchRange(int[] nums, int target) {
        
        int stAns=searchStartEnd(nums, target, true);
        int endAns=searchStartEnd(nums, target, false);

        int[] ans = {-1,-1};
        ans[0]=stAns;
        ans[1]=endAns;

        return ans;
       

    }

    public static int searchStartEnd(int[] nums,int target, boolean isStart){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int ans=-1;

        while (start<=end) {
            mid=(start+end)/2;

            if(target>nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                ans=mid;
                if (isStart) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int sz=in.nextInt();

        int[] arr=new int[sz];

        System.out.print("Enter the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        System.out.print("Enter the target : ");
        int target=in.nextInt();

        int[] result=searchRange(arr, target);
        System.out.println("Start index: " + result[0] + ", End index: " + result[1]);
    }
}
    

