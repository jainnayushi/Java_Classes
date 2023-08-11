package Daywise_Notes.Day11;


/**
 * @Author : Ayushi Jain
 *
 */
class Parent{
    public String laugh(){
        return "Parent laughed";
    }
}

class Son extends Parent{
    @Override
    public String laugh(){
        return "Son laughed";
    }
}

class GrandSon extends Son{
//    @Override
//    public int laugh(){ // Not Allowed : have to have exact copy of function to override
//        return 2;
//    }


}

class Daughter extends Parent{

}


public class Day11_Overriding {
    public static void main(String[] args) {
        Son son = new Son();
        Daughter daughter = new Daughter();
        GrandSon grandSon = new GrandSon();

        System.out.println("laugh() from Son in Son --- " + son.laugh());
        System.out.println("laugh() from Parent in Daughter --- " + daughter.laugh());
        System.out.println("laugh() from Son in GrandSon --- " + grandSon.laugh());
        System.out.println();


    }
}
