package Daywise_Notes.Day3;

public class Day3 {
    public static void main(String[] args) {

//        1 - 10

//        System.out.println(1);
//        System.out.println(2);
//        .
//        .
//        System.out.println(10);


        // While loop
//        1. Initialization
//        while(2. Condition){    : It doesn't go in Infinite loop
//            //statements
//            3. Modify
//        }



        int i = 1;
        while(i<=10){
            System.out.print(i); // 12345678910
            i=i+1;
        }

        System.out.println();

//        0 - 5


        int j = 0;
        while(j<=5){
            System.out.print(j);
            j++;
        }

//        20 to 7
        int k = 20;
        while(k>=7){
            System.out.println(k);
            k--;
        }

//        1 to 10 : Even numbers

        System.out.println();

        int x = 1;
        while(x<=10){
            if(x%2==0){
                System.out.print(x + " ");
//                x++; // Option 1
            }
            x++; // Option 2
        }

        // x 1 2
        // 2

        //find output
        int y = 1;
        while(y>10){
            System.out.println(y);
            y--;
        }
//        Output : No Output

        //find output ?
//        int z = 10;
//        while(z>=10){
//            System.out.println(z);
//            z++;
//        }
//        Output : 10 11 12 ...... Infinite loop


        // 2. Do - While - Run atleast Once
//        1. Initialization
//        do{
//            // Statements
//            3. Modification
//        }while(2. condition);

        System.out.println();
        System.out.println(1 + 1);  // 2 : Integer Addition
        System.out.println(1 + "1"); // 11 : String Concatenation
        System.out.println();


        System.out.print(1);
        System.out.print(5);
        System.out.println(2);
        System.out.println();
        System.out.print(3);
//152
//
//3

        System.out.println();

        int a = 1;
        do{
            System.out.print(a + " ");
            a++;
        }while(a<=10);
//1 2 .. 10
//Find Output ?
        int b = 1;
        do{
            if(b%2==0){
                System.out.print(b + " ");
            }
            b++;
        }while(b<=10);
//  Output : 2 4 6 8 10

//        See the difference between While and Do-While

//Find Output ?
        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c>5);
//  Output : 1

// Find Output ?
        int d = 1;
        while(d>5){
            System.out.println(d);
            d++;
        }
//  Output : No Output

// See why drawing box+ Screen is imp

        int e = 10;
        while(e>5){
           if(e%2==1){
               System.out.println(e);
           }
            e--;
        }

//        Output : 9 7


        int f = 1;
        while(f<=5){
            System.out.println("* ");
            f++;
        }
//        * ** *** **** ***** Wrong
//        f : 1 2 3 4 5
//        Output : * * * * * Correct

        System.out.println();
        System.out.println();
        int g = 1;
        while(g<=5){
            int h = 1;
            while(h<=g){
                System.out.print("* ");
                h++;
            }
            System.out.println();
            g++;
        }
//*
//* *
//* * *
//* * * *
//* * * * *

//        162 - 163 - 164 - 165 - 166 - 167 - 165 166 167 165 - 169 - 170 - 163

        System.out.println();
        System.out.println();


        int m = 5;
        while(m>=1){
            int n = 1;
            while(m>=n){
                System.out.print("* ");
                n++;
            }
            System.out.println();
            m--;
        }









    }
}
