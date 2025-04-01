package JavaBasic.ClassesAndObjects;

import java.util.Scanner;

public class Book {
    String author, title;
    double price;

    public Book(String author, String title, double price){
        this.author = author;
        this.title =title;
        this.price = price;
    }
    public void display(){
        System.out.println("Book: " + title + " by " + author + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String author = scan.nextLine();
        String title = scan.nextLine();
        double price = scan.nextDouble();
        Book b = new Book(author, title, price);
        b.display();
    }
}
