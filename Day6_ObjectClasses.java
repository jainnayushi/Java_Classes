package Daywise_Notes.Day6;

class Rectangle{
    // Variables - Properties
    private static int length;
    public static int width;

    // Methods - Functionalities

    public void set_dimensions(int l, int w){
        length = l;
        width = w;
    }

    public static void show_dimensions(){
        System.out.println("Length : " + length + " & Width is : " + width);
    }

}

public class ObjectClasses {
    public static void main(String[] args) {
        // Creating an object : new
        Rectangle r1 = new Rectangle();
        r1.set_dimensions(10,20);
        Rectangle.show_dimensions();
        Rectangle.show_dimensions();

        Rectangle r2 = new Rectangle();
        r2.set_dimensions(40,50);
        Rectangle.show_dimensions();
    }
}
