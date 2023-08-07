package Daywise_Notes.Day;

import java.util.Scanner;

class Rectangle{
    int length;
    int width;
    void insert(int l, int w){
        length=l;
        width=w;
    }

//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }

    void calculateArea(){System.out.println(length*width);}
}

class Day {
    static void func1(){
        System.out.println("In func1");
    }
    static void func2(String name){
        System.out.println("Hi "+name);
    }
    public static void main(String args[]){
//creating Scanner class object

        Scanner scan=new Scanner(System.in);
//      reading value from user

//        System.out.print("Enter the number: ");
//        int num=scan.nextInt();
//        System.out.println(num);

        System.out.print("Enter your name : ");
        String str=scan.nextLine();
        System.out.println(str);

        func1();
        func2("Function_Types");
        func2(str);



//                1. Initialize using method
//        Rectangle r1=new Rectangle();
//        Rectangle r2=new Rectangle();
//        r1.insert(11,5);
//        r2.insert(3,15);
//        r1.calculateArea(); //55
//        r2.calculateArea(); //45


//      2. Initialize using Contructor
//        Rectangle r1=new Rectangle(12,5);
//        Rectangle r2=new Rectangle(4,10);
//        r1.calculateArea(); //55
//        r2.calculateArea(); //45

    }
}
