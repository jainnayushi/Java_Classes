<!-- KT -->
1. Book : title, author, year
2. Paperback extends Book : price : getPrice()
3. HardCopy extends Book : price , hardFactor : getPrice()
4. Driver

Driver Class : 
Book[] books = new Book[100];

Enter title / Enter 'quit' to stop :





<!-- 100 Enteries NO QUIT -->

1.
Enter title / Enter 'quit' to stop : Harry potter
Enter author : ....
Enter year : ....
Do u need paperback ? : yes
    Enter price : ....
[Book{title,author,year,price}]
2.
Enter title / Enter 'quit' to stop : Harry potter
Enter author : ....
Enter year : ....
Do u need paperback ? : yes
    Enter price : ....
[Book{title,author,year,price},Book{title,author,year,price}]
.
.
.
99.
Enter title / Enter 'quit' to stop : Harry potter
Enter author : ....
Enter year : ....
Do u need paperback ? : no
Do u need hardcopy ? : yes
    Enter price :
    Enter hardfactor :
100.
Enter title / Enter 'quit' to stop : Harry potter
Enter author : ....
Enter year : ....
Do u need paperback ? : no
Do u need hardcopy ? : yes
    Enter price :
    Enter hardfactor :
[Book{title,author,year,price},Book{title,author,year,price}...............Book{title,author,year,price,hardFactor}]



<!-- 100 Enteries NO QUIT -->

1.
Enter title / Enter 'quit' to stop : Harry potter
Enter author : ....
Enter year : ....
Do u need paperback ? : yes
    Enter price : ....
[Book{title,author,year,price}]
2.
Enter title / Enter 'quit' to stop : Harry potter
Enter author : ....
Enter year : ....
Do u need paperback ? : yes
    Enter price : ....
[Book{title,author,year,price},Book{title,author,year,price}]
.
.
.
66.
Enter title / Enter 'quit' to stop : quit
[] : 65 object in the array



///

Do u need paperback ? : 
String res1 = yes
if(res1=="yes"){
    Enter price : ....
}else{
    Do u need hardFactor ? : yes
    String res2 = yes
    if(res2==yes){
        Enter price :
        Enter hardfactor :
    }
}



books[0] = obj


<!-- int[] arr 
Creation of array of type Book
Book[] books = new Book[100]; -->

<!-- 
int a = 5
~
Shape obj = new Circle()
Shape = Reference
new Circle() ~ Object 
-->






```java

import java.util.Scanner;

class Book {
private String title;
private String author;
private int year;

public Book(String title, String author, int year) {
this.title = title;
this.author = author;
this.year = year;
}

public String getTitle() {
return title;
}

public String getAuthor() {
return author;
}

public int getYear() {
return year;
}

@Override
public String toString() {
return title + ", " + author + ", " + year;
}

public double getPrice() {
return 0; // Placeholder, to be overridden in subclasses
}
}

class Paperback extends Book {
private double price;

public Paperback(String title, String author, int year, double price) {
super(title, author, year);
this.price = price;
}

@Override
public double getPrice() {
return price;
}

@Override
public String toString() {
return "Paperback: " + super.toString() + ", Price: $" + price;
}
}

class HardCopy extends Book {
private double price;
private double hardFactor;

public HardCopy(String title, String author, int year, double price, double hardFactor) {
super(title, author, year);
this.price = price;
this.hardFactor = hardFactor;
}

@Override
public double getPrice() {
return price * hardFactor;
}

@Override
public String toString() {
return "HardCopy: " + super.toString() + ", Price: $" + getPrice();
}
}

public class Driver {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Book[] books = new Book[100];
int bookCount = 0;

while (bookCount < 100) {
System.out.print("Enter book title (or 'quit' to stop): ");
String title = scanner.nextLine();

if (title.equalsIgnoreCase("quit")) {
break;
}

System.out.print("Enter author: ");
String author = scanner.nextLine();

System.out.print("Enter year: ");
int year = scanner.nextInt();
scanner.nextLine(); // Consume the newline

System.out.print("Enter price: ");
double price = scanner.nextDouble();
scanner.nextLine(); // Consume the newline

System.out.print("Is this a hardcopy? (yes/no): ");
String hardCopyInput = scanner.nextLine();
boolean isHardCopy = hardCopyInput.equalsIgnoreCase("yes");

if (isHardCopy) {
System.out.print("Enter hardFactor: ");
double hardFactor = scanner.nextDouble();
scanner.nextLine(); // Consume the newline
books[bookCount] = new HardCopy(title, author, year, price, hardFactor);
} else {
books[bookCount] = new Paperback(title, author, year, price);
}

bookCount++;
}

System.out.println("\nBooks with prices over $100.0:");
for (int i = 0; i < bookCount; i++) {
Book book = books[i];
if (book.getPrice() > 100.0) {
System.out.println(book.toString());
}
}
}
}

```