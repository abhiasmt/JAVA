public class DataTypes02 {
    public static void main(String[] args) {
        //---Primitive data types------//

        /*
        
        | Type      | Size    | Example             |
        | --------- | ------- | ------------------- |
        | `byte`    | 1 byte  | `byte a = 10;`      |
        | `short`   | 2 bytes | `short s = 100;`    |
        | `int`     | 4 bytes | `int x = 50;`       |
        | `long`    | 8 bytes | `long l = 1000L;`   |
        | `float`   | 4 bytes | `float f = 3.5f;`   |
        | `double`  | 8 bytes | `double d = 3.14;`  |
        | `char`    | 2 bytes | `char c = 'A';`     |
        | `boolean` | 1 bit   | `boolean b = true;` |


        -Features
            Store actual value
            Faster
            Fixed size
            Cannot call methods


        */

        int num1=87;//Store an int value
        float num2=89.985f;
        double num3=6378.983759736;
        char ch='a';
        boolean cs=true;


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(ch);
        System.out.println(cs);


        //Non Primitive ->
        /*
        String
        Arrays
        Classes
        Objects
        Interface



        -Features
            Store reference (address)
            Can call methods
            Size not fixed
            Created by programmer (except String & array)
        */

            String name ="Abhi";

            int Arr[]={1,2,3,4,5,6};

            System.out.println(name);
            
            System.out.print(Arr[0]);
            System.out.print(Arr[1]);
            System.out.print(Arr[2]);
            System.out.print(Arr[3]);
            System.out.print(Arr[4]);

        


    }
}
