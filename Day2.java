public class Day2 {
    public static void main(String[] args) {

        // If age>18 : Eligible : Not Eligible
        int age = 18;
//        if - else
//        if(condition){
//            // statements
//        }else{
//            //statement
//        }


//        System.out.println("age"); // age
//            System.out.println(age); // 17

//        if(age>=18){
//            System.out.println("Eligible");
//        }else{
//            System.out.println("Not Eligible");
//        }


//         If age>18 : Eligible , else : Not Eligible, age=18 : Eligible and Be Careful

//        if(condition1){
//            //Statements
//        }
//        else if(condition2){
//            //Statements
//        }
//        else{
////            Statements
//        }
        
        // Dry Run
        if(age>18){
            System.out.println("Eligible");
        } else if (age==18) {
            System.out.println("Eligible and Be Careful");
        }else{
            System.out.println("Not eligible");
        }

// if-else, Else -if
        // 1. Conditions
//        2. Statements - Action
        //3. Edge Cases : 16, 18, 22


        // Nested IF-Else
        if(age>18){
            System.out.println("Eligible");
        } else if (age==100) {
            System.out.println("Better Rest");
        } else if (age==18) {
            System.out.println("Eligible and Be Careful");
        }else{
            System.out.println("Not eligible");
        }

//else is Optional

        if(age>1){
            System.out.println("Age Entered");
        }


        if(age==1){
            System.out.println("Eligible");
        } else if (age==100) {
            System.out.println("Better Rest");
        } else if (age==18) {
            System.out.println("Eligible and Be Careful");
        }

//0-9 , 10-20 , >20
//        age 25
//&& - AND- BOTH TRUE - TRUE,
        // || - OR - ANY ONE TRUE - THEN TRUE
//        LOGICAL - true && true, true&&false

//        age =10

//        10<10 - false
//                10>10 && 10<20 - false &&

        if(age<10){
            System.out.println("Group 1");
        }
        else if(age>10 && age<20){
            System.out.println("Group 2");
        }
        else if(age>20){
            System.out.println("Group 3");
        }

        // NO OUTPUT

//        0-9 : GRoup 1, 10-20 - Group 2, >20 - Group 3
        if(age<10){
            System.out.println("Group 1");
        }
        else if(age>=10 && age<=20){
            System.out.println("Group 2");
        }
        else if(age>20){
            System.out.println("Group 3");
        }


//        age - 25
//        age>10 && age<20 - true && false - false

//        Identify Even and Odd number

//        10 / 2 = 5
//                10 % 2 = 0
//        11 / 2 = 5.5
//                11 % 2 = 1

//        10 % 3 = 1
//                11 % 3 = 2

//number % 2 = 0 : even, else - odd


//        long int - 74362398635632548354823548752947529754235468254626452864581257 % 2
////1
//        if(condition){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//2
//        if(condition1){
//            System.out.println("Odd");
//        }else{
//            System.out.println("Even");
//        }
//        //3
//        if(condition1){
//            System.out.println("Odd");
//        }else if(condition2){
//            System.out.println("Even");
//        }
////4
//        if(condition1){
//            System.out.println("Even");
//        }
//        if(condition2){
//            System.out.println("Odd");
//        }

        int x = 7;

//        if(x%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }

//        if(x%2==1){
//            System.out.println("Odd");
//        }else{
//            System.out.println("Even");
//        }

//        if(x%2==0){
//            System.out.println("Even");
//        }else if(x%2==1){
//            System.out.println("Odd");
//        }
//
//        if(x%2==0){
//            System.out.println("Even");
//        }
//        if(x%2==1){
//            System.out.println("Odd");
//        }

        int y = 1;
        if(y==1){
            System.out.println("Monday");
        }else if(y==2){
            System.out.println("Tuesday");
        }else if(y==3){
            System.out.println("Wednesday");
        }else if(y==4){
            System.out.println("Thursday");
        }else if(y==5){
            System.out.println("Friday");
        }else{
            System.out.println("Week Day");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        switch(y){
            default:
                System.out.println("Week Day");
            case 1 :
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        switch(y){
            default:
                System.out.println("Default");
                System.out.println("Week Day");
                break;
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
        }


int num1 = 2;
        switch(num1%2){
            case 1:
                System.out.println("Odd");
                break;
            case 0:
                System.out.println("Even");
        }







        }



























}
