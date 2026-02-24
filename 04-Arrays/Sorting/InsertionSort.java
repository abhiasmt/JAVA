
import java.util.*;
public class InsertionSort {

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int tempEl=arr[i];
            int j=i;
            while (j>0 && tempEl<arr[j-1]) {
                arr[j]=arr[j-1];
                j--;
            }
            int temp=arr[j];
            arr[j]=tempEl;
            tempEl=temp;

        }
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

        // int[] arr={5,4,-3,2,1,0,78,56,34,23,12,11};
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
