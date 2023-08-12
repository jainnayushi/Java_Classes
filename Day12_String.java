package Daywise_Notes.Day12;

class StringExample{
    public static void main(String args[]){
        String s1="java";
        String s5="java";
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);
        String s3=new String("example");
        String s4=new String("example");
        String s6=new String("java");

        System.out.println(s1);
        System.out.println(s5);
        System.out.println(s1==s5); // true

        System.out.println(s2);

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3==s4); // false

        ///
        System.out.println(s1==s6); // false
    }}
