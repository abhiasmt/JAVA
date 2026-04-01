//Finding ODD or EVEN with out using % (modulo) operator

public class EvenOdd {
    public static void main(String[] args) {
        int num=26;
        isEven(num);
    }

    public static void isEven(int num){
        boolean isEven=(num & 1)==1;// Using AND operator

        if(isEven==true){
            System.out.println("It's a ODD num");
        }else{
            System.out.println("It's a EVEN num");
        }
    }
}
