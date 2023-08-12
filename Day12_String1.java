package Daywise_Notes.Day12;

import java.awt.desktop.QuitEvent;

public class Day12_String1 {
    public static void main(String[] args) {
//        1. String literal
        String s1 = "Sara";
        String s2 = "sara";
        String s3 = "Sara";
        System.out.println(s1==s2); // false
        System.out.println(s1==s3); // true


        String ss1 = new String("Ayushi");
        String ss2 = new String("ayushi");
        String ss3 = new String("Ayushi");
        System.out.println(ss1==ss2); // false
        System.out.println(ss1==ss3); // false

        System.out.println();
        System.out.println();

        String str = "I am a String";
        String str2 ="";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());


        String a1 = "Sara";
        String a2 = "sara";
        System.out.println(a1.equals("sara")); //false
        System.out.println(a1.equalsIgnoreCase("sara")); //true



//        char ch[]={'s','t','r','i','n','g','s'};
        char ch[] =  a2.toCharArray();
        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }

    }
}
