package Daywise_Notes.Day7;

import java.util.Scanner;

public class Day7_FunctionsPractice {

    // Return Nothing
    static void isEvenOdd(int num){
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    // Return Something
    static String isEvenOdd2(int num){
        if(num%2==0){
            return("Even");
        }else{
            return("Odd");
        }
    }

    public static int add(int x, int y){
        return x+y;
    }
    public static int add(int x, int y, int z){
        return x+y+z;
    }



    public static void main(String[] args) {

        // Function to check even and odd
        int num=0;
        isEvenOdd(num);
        String res = isEvenOdd2(num);
        System.out.println(res);

        String name="ayushi";
        if(name=="ayushi"){
            System.out.println("hi");
        }else{
            System.out.println("bye");
        }// hi

        if(name=="Ayushi"){
            System.out.println("hi");
        }else{
            System.out.println("bye");
        }//bye

//        ayushi==Ayushi : False



//        System.out.print("Enter your name : ");
//        String str=scan.nextLine();
//        System.out.println(str);


        // Scope
//        {
//            int a = 10;
//        }
//        if(a==10){
//            System.out.println(a);   /// Error
//        }

//        {
//            int a = 10;
//            if (a == 10) {
//                System.out.println(a);   /// 10
//            }
//        }









    }
}
