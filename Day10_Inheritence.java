package Daywise_Notes.Day10;

class Shape{
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}

class Circle extends Shape{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea(int radius){
        return Math.PI * radius * radius;
    }

    public Circle(String color, boolean filled, int radius){
        super(color, filled);
        this.radius = radius;
    }
}

class Rectangle extends Shape{
    private int length;
    private int width;

    public int calculateArea(int l, int w){
        return l*w;
    }

    public Rectangle(String color, boolean filled, int length, int width){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}




public class Day10_Inheritence {
    public static void main(String[] args) {
        Circle circle = new Circle("yellow", true, 5);
        System.out.println("My Circle is " + circle.getColor() + " in color and has area of " + circle.calculateArea(5));

        System.out.println();
        Rectangle rectangle = new Rectangle("Red", false, 10, 20);
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getFilled());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.calculateArea(10,20));

    }
}
