package Daywise_Notes.Questions;

// Import Scanner
import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString(){
        return title + " " + author +" " + year;
    }

    public float getPrice(){
        return 0;
    }
    // Getters and Setters for title, author, year
}


class Paperback extends Book{
    private float price;

    public Paperback(String title, String author, String year, float price){
        super(title, author, year);
        this.price = price;
    }

    @Override
    public String toString(){
        return "Paperback : " + super.toString() + " " + price;
    }

    @Override
    public float getPrice(){
        return price;
    }
}


class HardCopy extends Book{
    private float price;
    private float hardFactor;

    public HardCopy(String title, String author, String year, float price, float hardFactor){
        super(title, author, year);
        this.price = price;
        this.hardFactor = hardFactor;
    }

    @Override
    public String toString(){
        return "HardCopy : " + super.toString() + " " + price + " " + hardFactor;
    }

    @Override
    public float getPrice(){
        return price * hardFactor;
    }
}


class Driver {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Book[] books = new Book[100];

        int bookCount= 0;
        for(bookCount= 0; bookCount<100; bookCount++){

            System.out.println("Enter : ");
            String h = scanner.nextLine();
            System.out.println("Enter book title or 'Quit' to stop : ");
            String title = scanner.nextLine();

//         Stop accepting user inputs after it enters quit
           if(title.equalsIgnoreCase("quit")){
               break;
           }

           System.out.println("Enter book author : ");
           String author = scanner.nextLine();
           System.out.println("Enter book year : ");
           String year = scanner.nextLine();
            System.out.println("Type 'Yes' for Paperback and 'No' for HardCopy : ");
            String bookChoice = scanner.nextLine();
            Boolean isPaperback = bookChoice.equalsIgnoreCase("yes"); // Handle varities : yes Yes YES

            if(isPaperback){
                System.out.println("Enter book price : ");
                Float price = scanner.nextFloat();
                // Add details in books array
                books[bookCount] = new Paperback(title, author, year, price);
            }else{
                System.out.println("Enter book price : ");
                Float price = scanner.nextFloat();
                System.out.println("Enter book hardFactor : ");
                Float hardFactor = scanner.nextFloat();
                // Add details in books array
                books[bookCount] = new HardCopy(title, author, year, price, hardFactor);
            }
        }

        System.out.println();

        System.out.println("Books with prices over $100.0 are as follows :- ");
        for(int i =0; i<bookCount; i++){
            Book book = books[i];
            if(book.getPrice()>100.0){
                System.out.println(book.toString());
            }
        }

    }
}

