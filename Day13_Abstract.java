package Daywise_Notes.Day13;

class A{

}

abstract class B{
    int a = 10;
    void func(){ // Normal Function

    }
    abstract void func2(); // Abstract function

}

abstract class Saving{
    int z;
    abstract int calculateInterest();
}

class CurrentAccount extends Saving{
    int x;
    void a(){

    }
    int calculateInterest(){
        System.out.println("in func");
        return 0;
    }


}

abstract class SavingAccount extends Saving{
    void func4(){

    }
}

abstract class D extends SavingAccount{

}


public class Day13_Abstract {
    public static void main(String[] args) {
        A a = new A();
//        B b = new B();
    }
}
