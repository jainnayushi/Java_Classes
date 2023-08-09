package Daywise_Notes.Day9;

class OuterClass {
    int x = 10;
    private int z = 40;



    static public class InnerClass {
        int y = 5;
    }

    public void func(){
        OuterClass myOuter = new OuterClass();
        System.out.println(myOuter.z);
    }
}

public class Day9_InnerClass {
    protected int test = 100;


    public static void main(String[] args) {
//        1 : Same Class
        Day9_InnerClass obj = new Day9_InnerClass();
        System.out.println(obj.test);


        OuterClass myOuter = new OuterClass();

//        myOuter.z
//            Create Object of Static Inner Class
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
//            Create Object of Instance Inner Class
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}