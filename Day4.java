package Daywise_Notes.Day4;

public class Day4 {
    public static void main(String[] args) {

//        int b =1;
//        while(b<=10){
//            System.out.println(b);
//            b++;
//        }
//
//        for(int c=1; c<=10; c++){
//            System.out.println(c);
//        }

//        1 - 20 : Print even numbers

//        int d=1;
//        while( d<=20){
//            if(d%2==0){
//                System.out.print(d + " ");
//            }
//            d++;
//        }

//        int d;
//        for(d=1; d<=20; d++){
//            if(d%2==0){
//                System.out.print(d + " ");
//            }
//        }
//
//        System.out.println();
//        System.out.println();

// Star Question
//        int m;
//        for(m=5; m>=1; m--){
//            int n = 1;
//            for(n=1; m>=n; n++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Check prime number
//        int num = 29;
//        int a =2;
//        boolean isPrime = true;
//
//        if(num==1|| num==0){
//            isPrime=false;
//        }
//        else{
//            while(a<num){
//                if(num%a==0){
//                    isPrime=false;
//                    break;
//                }else{
//                    a++;
//                }
//            }
//        }
//        if(isPrime==false){
//            System.out.println("Not a Prime");
//        }else{
//            System.out.println("Prime");
////        }

// 1- 10

//        1-10
//1,2,3,4,5 - stop
//        1 2 3 4 6 7 8 9 10

//        for(int e=1; e<=10; e++){
//            if(e==5){
////                break;
//                continue;
//            }
//            System.out.println(e); // Break : 1 2 3 4, Continue : 1 2 3 4 6 7 8 9 10
//        }

        for(int e=1; e<=10; e++){
            if(e%2==0){
                break;
//                continue;
            }
            System.out.println(e);  // Break : 1, Continue : 1 3 5 7 9
        }
//         e- 1 2 3 4 5 6 7 8 9 10

//            1 3 5 7 9



//        e - 1 2
//        1







    }
}
