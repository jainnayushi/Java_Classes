package Daywise_Notes.Day7;

public class Day7 {
    static int x = 5;

    public static void main(String[] args) {
      Day7 myObj1 = new Day7();  // Object 1
      Day7 myObj2 = new Day7();  // Object 2
      myObj2.x = 25;
      System.out.println(myObj1.x);  // Outputs 5
      System.out.println(myObj2.x);  // Outputs 25
      System.out.println(Day7.x);  // Outputs 25

    }
}
