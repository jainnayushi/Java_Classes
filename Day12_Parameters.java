package Daywise_Notes.Day12;

public class Day12_Parameters {

//    Call by value
    public static void func(int a){
        System.out.println(a);
    }

//    Call by reference
    public static void func2(int[] arr){
        System.out.println(arr); // [I@e9e54c2
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        func(3);
        int[] arr = {1,2,3};
        func2(arr);
    }
}
