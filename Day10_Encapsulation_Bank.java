package Daywise_Notes.Day10;

class Bank{
    private int balance;
    public static float interestRate = 7.5f;

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }

    public Bank(int balance){
        this.balance = balance;
    }


}


public class Day10_Encapsulation_Bank {
    public static void main(String[] args) {
        Bank user1 = new Bank(100);

        System.out.println( user1.interestRate);
//        System.out.println(user1.balance);

        System.out.println(user1.getBalance());

        user1.setBalance(200);
        System.out.println(user1.getBalance());

    }
}
