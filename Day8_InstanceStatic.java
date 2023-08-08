package Daywise_Notes.Day8;

class Animal{
    static int legs;
    int legs_number;
}

public class Day8_InstanceStatic {
    public static void main(String[] args) {

        System.out.println(Animal.legs);

        Animal cat = new Animal();
        System.out.println(cat.legs_number);

        Animal kangaroo = new Animal();
        System.out.println(kangaroo.legs_number);
    }
}
