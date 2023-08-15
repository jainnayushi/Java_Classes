package Daywise_Notes.Day14;

interface I1{
    int x = 10;

    static void func(){};
}

class A implements I1{
    void func(){
        System.out.println("My version");
    }
}

public class Day14 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("classname instance");
        System.out.println("classname instance ");
        System.out.println("classname instance " + x);
        System.out.println("classname instance " + x + " bye");


    }
}
