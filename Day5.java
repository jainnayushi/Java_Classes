package Daywise_Notes.Day5;

public class Day5 {
    public static void main(String[] args) {
// Infinite loop
//                int a=10,b=20;
//                for(int i=0;a<b;i++){
//                    System.out.println("hello");
//                }
//                System.out.println("hi");
    // hello...9times hi

    int x = 10; // 4bytes
    float y = x; // 4bytes

    System.out.println(x + "-----" + y);
    System.out.println();

    int c = 10; // 4bytes
    double d = c; // 8bytes

        System.out.println(c + "-----" + d);
        System.out.println();

        d = 10735874.098; // ~ 1.0735874098E7 = 10735874.098

        c = (int)d;
        System.out.println(c + "-----" + d);
        System.out.println();

//        int e = 3;
//        char ch = 'a';
//        ch = e;

//        Take aways
//        1. Conversions happen in compatible types
//        2. Explicit(c = (int)d;), Implicit(double d = c;)
//        3. Take care of lossy conversions

        float f = 10.99f;
        int g = (int)f;
//        int g = f; // incompatible types: possible lossy conversion from float to int
        System.out.println(g);
        System.out.println();


        System.out.println(10.4/2); // 5.2
        System.out.println(10.4/2.0); // 5.2
        System.out.println(1234 / 10); // 123
        System.out.println(10/3); // 3
//        Take away :
//      1. int/ int - int
//      2. int/float or float/int or float/float - float

//        1234 % 10 = 4  : Last digit
//        1234 / 10 = 123 : Number without last digit

//        Count the digits in a number : input - 1234 , output - 4
//        num = 1234;

//        count = 2

//        1234 % 10 = 4  : Last digit
//        1234 / 10 = 123 : Number without last digit

//        123 % 10 = 3
//        123 /10 = 12

//        12 % 10 = 2
//        12 / 10 = 1

//        1 % 10 = 1
//        1 / 10 = 0 : Stop


//        int num = 123456789;
//        int count = 0;
//        int random=0;
//
//        while(num!=0){
//            random = num % 10;
//            count++;
//            num = num/10;
//        }
//        System.out.println(count);


//        Q - Add digits of a number, Input = 1234, Output = 1+2+3+4 = 10
        int num = 123456789;
        int count = 0;
        int random=0;
        int sum = 0; // 4

        while(num!=0){
            random = num % 10; // getting me the last digit
            sum = sum+random;
            count++;
            num = num/10; // removing last digit from number
        }
        System.out.println("Sum of digits is " + sum);
        System.out.println("No. of digits is " + count);


//        ------------------------------------------------------

// Initialization
//ASCII
        System.out.println("Learning Array Now..............");
//        int arr_char[] = {'a','b','c','d','e'};
//        System.out.println(arr_char.length); // 5
//        System.out.println(arr_char[0]); // 97
////        System.out.println(arr_char[5]); // Error or garbage  : Out of bound Indexing
//        System.out.println(arr_char[2]); // 99

        char arr_char[] = {'a','b','c','d','e'};
        System.out.println(arr_char.length); // 5
        System.out.println(arr_char[0]); // a
        System.out.println(arr_char[2]); // c

        // Loop
//        int array1 = new int[]{1, 2, 3};
        int array1[] = {1,2,3,4,5,6,7,8,9}; // Length = 9 , Index range = 0 to 8
        int i;
//        for(i=0; i<= array1.length-1; i++){ // 0 to 8
//
//        }
        System.out.println();
        for(i=0; i<array1.length; i++){ // 0 to 8
            System.out.println(array1[i]);
        }
//or
        System.out.println();
        int j=0;
        while(j<array1.length){
            System.out.println(array1[j]);
            j++;
        }






    }




//    int[] a = {10,20,30,40,50};
//for(int i=0; i<a.length; i++){
//        System.out.println(a[i]);
//    }
//
//    // Enhanced For
//    int[] a = {10,20,30,40,50};
//for(int x : a){
//        System.out.println(x);
//    }
    
}
