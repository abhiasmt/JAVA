//Find the N-th Fibonacci number

public class Fibo01 {

    public static void main(String[] args) {
        System.out.println(Fibo(6));   
    }

    public static int Fibo(int n){

        if (n<2) {
            return n;
        }
        
        return Fibo(n-1)+Fibo(n-2);

        // int ans=Fibo(n-1)+Fibo(n-2);
        // return ans;
    }
}
