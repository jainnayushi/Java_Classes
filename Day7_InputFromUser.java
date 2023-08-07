package Daywise_Notes.Day7;

import java.util.Scanner;

public class Day7_InputFromUser {
    static void add(int x, int y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //  reading value from user
//        System.out.print("Enter the number1 : ");
//        int num1=scan.nextInt();
//        System.out.print("Enter the number2 : ");
//        int num2=scan.nextInt();
//
//        add(num1,num2);
//        add(6,7);
////        System.out.println(num1+num2);
//        System.out.println("hi");
//        System.out.println("hi");
//        System.out.println("hi");
//        System.out.println("hi");
//        System.out.println("hi");
//        System.out.println("hi");
//        System.out.println("hi");
//        add(num1,num2);
////        System.out.println(num1+num2);
//
//
//        System.out.println();

        System.out.print("Enter your name : ");
        String str=scan.nextLine();
        System.out.println("Hello " + str);

//        x=x+1
        str= str + " bye";
        System.out.println(str);
    }

}
