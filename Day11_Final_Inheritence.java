package Daywise_Notes.Day11;

class A{
    int x=10;

    public void func(){
        System.out.println(x);
        x=20;
        System.out.println(x);
    }
}

class B extends A{

}

public class Day11_Final_Inheritence {
    public static void main(String[] args) {
      A a = new A();
      a.func();
    }
}
