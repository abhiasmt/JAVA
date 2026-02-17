import java.util.*;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x =in.nextInt();


        int a=0;
        int b=1;
        int sum =1;
        
        System.out.print(a+" "+b+" "+sum+" ");
        a++;
        
        for(int i=2;i<=x;i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }    
}
