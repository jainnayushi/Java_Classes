```java
public class StandardCabin {

// Instance variables
private String bedType;
private int numberOfBeds;
private boolean hasWifi;
private boolean hasTV;

// Constructor
public StandardCabin(String bedType, int numberOfBeds, boolean hasWifi, boolean hasTV) {
this.bedType = bedType;
this.numberOfBeds = numberOfBeds;
this.hasWifi = hasWifi;
this.hasTV = hasTV;
}

// Methods

// Returns the bed type of the cabin.
public String getBedType() {
return bedType;
}

// Returns the number of beds in the cabin.
public int getNumberOfBeds() {
return numberOfBeds;
}

// Returns whether the cabin has Wi-Fi.
public boolean hasWifi() {
return hasWifi;
}

// Returns whether the cabin has a TV.
public boolean hasTV() {
return hasTV;
}

// Provides a service to make the bed.
public void makeBed() {
System.out.println("Making the bed in the standard cabin.");
}

// Provides a service to turn on the TV.
public void turnOnTV() {
System.out.println("Turning on the TV in the standard cabin.");
}
}

public class PremiumCabin extends StandardCabin {

// Instance variables
private boolean hasNespressoMachine;
private boolean hasBalcony;

// Constructor
public PremiumCabin(String bedType, int numberOfBeds, boolean hasWifi, boolean hasTV, boolean hasNespressoMachine, boolean hasBalcony) {
super(bedType, numberOfBeds, hasWifi, hasTV);
this.hasNespressoMachine = hasNespressoMachine;
this.hasBalcony = hasBalcony;
}

// Methods

// Returns whether the cabin has a Nespresso machine.
public boolean hasNespressoMachine() {
return hasNespressoMachine;
}

// Returns whether the cabin has a balcony.
public boolean hasBalcony() {
return hasBalcony;
}

// Provides a service to make the bed and bring a cup of coffee from the Nespresso machine.
public void makeBedAndBringCoffee() {
makeBed();
System.out.println("Bringing a cup of coffee from the Nespresso machine.");
}

// Provides a service to turn on the TV and open the balcony doors.
public void turnOnTVAndOpenBalconyDoors() {
turnOnTV();
System.out.println("Opening the balcony doors.");
}
}
```

---

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

@Override
public String toString() {
return title + ", " + author + ", " + year + ".";
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
}

public class Driver {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Book[] books = new Book[100];
int bookCount = 0;

while (bookCount < 100) {
System.out.print("Enter book title (or 'quit' to exit): ");
String title = scanner.nextLine();
if (title.equalsIgnoreCase("quit")) {
break;
}

System.out.print("Enter author: ");
String author = scanner.nextLine();

System.out.print("Enter year: ");
int year = scanner.nextInt();
scanner.nextLine(); // Consume newline

System.out.print("Enter book type (Paperback or HardCopy): ");
String bookType = scanner.nextLine();

if (bookType.equalsIgnoreCase("Paperback")) {
System.out.print("Enter price: ");
double price = scanner.nextDouble();
scanner.nextLine(); // Consume newline
books[bookCount] = new Paperback(title, author, year, price);
} else if (bookType.equalsIgnoreCase("HardCopy")) {
System.out.print("Enter price: ");
double price = scanner.nextDouble();
scanner.nextLine(); // Consume newline
System.out.print("Enter hard factor: ");
double hardFactor = scanner.nextDouble();
scanner.nextLine(); // Consume newline
books[bookCount] = new HardCopy(title, author, year, price, hardFactor);
} else {
System.out.println("Invalid book type.");
continue;
}

bookCount++;
}

System.out.println("\nBooks with prices over $100:");
for (int i = 0; i < bookCount; i++) {
if (books[i].getPrice() > 100.0) {
System.out.println(books[i].toString());
}
}
}
}

```