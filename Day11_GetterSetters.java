package Daywise_Notes.Day11;

class Rectangle{
    private int length;
    private int width;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    // No Getter : Write-only for width
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Function to calculate and display area
     * @param l
     * @param w
     * @return nothing
     */
    public void area(int l,int w){
        System.out.println(l*w);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
public class Java11_GetterSetters {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        System.out.println(rectangle.getLength());

        rectangle.setLength(20);

        int x =300;
        System.out.println(x); // 300

        int[] arr = {1,2};
        System.out.println(arr); // [I@e9e54c2 // address of array

        System.out.println(rectangle);
//        1. without toString() ///Daywise_Notes.Day11.Rectangle@1b28cdfa  // address of object-rectangle
//        2. with toString() /// Rectangle{length=20, width=0}

    }
}
