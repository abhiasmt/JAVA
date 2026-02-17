
public class ReverseInteger {
    public static void main(String[] args) {
        int num = 12345;
        int temp=0;

        while (num>0) {
            int rem = num%10;
            temp = temp*10 + rem;
            num=num/10;
            
        }
        
        System.out.println("Reverse of the number is : "+temp);

    }
}
