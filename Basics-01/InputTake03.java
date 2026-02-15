import java.util.*;

public class InputTake03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//System.in is a argument used to take input from the System or Keyboard

        System.out.println("Enter two no : ");
        int num1=in.nextInt();
        int num2=in.nextInt();

        //Wrong Way =>
        // System.out.println("Sum : "+ num1+num2); => Output = Sum : 4345 if input are 43 and 45
        //Because => Addition of String (Sum) and integer are always a String

        //Correct way =>
        int sum=num1+num2;
        System.out.println("Sum : "+ sum);


        
       /*  
        nextInt() => To take Int value
        next() => To take first word of a String value
        nextLine() => To take String value
        nextBoolean() => To take Boolean value
        nextFloat() => To take Float value

            etc. etc.---->

        */
        

    } 
}
