package library.management.system;

import java.util.Scanner;

/*
* Name : Faris Ahmad Khayat
* ID : 2337100
* Section Number : CS8

 */
public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter number of Books for the current day:");
        int bookNum = reader.nextInt();
        
        System.out.println("--------------------------------------------------------------------");

        Book[] books = new Book[bookNum];

        for (int i = 0; i < bookNum; i++) {
            reader.nextLine(); 
            System.out.print("Enter Book's Tittle:");
            String tittle = reader.nextLine().trim();
            System.out.print("Enter Book's Purchases Cost:");
            double cost = reader.nextDouble();
            System.out.print("Enter book's type (C for Children, M for Motivational and B for Biographies ):");
            String type = reader.next().trim();

            System.out.println("--------------------------------------------------------------------");
            if (type.equalsIgnoreCase("C")) {
                books[i] = new Children(tittle, cost);
            } else if (type.equalsIgnoreCase("M")) {
                books[i] = new Motivational(tittle, cost);
            } else if (type.equalsIgnoreCase("B")) {
                books[i] = new Biographies(tittle, cost);
            }
        }

        
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof Biographies) {
                System.out.println("Biographies " + books[i].toString());
            }else if (books[i] instanceof Motivational) {
                System.out.println(books[i].toString());
            }else if (books[i] instanceof Children) {
                System.out.println(books[i].toString());
            }
        }
        System.out.println("--------------------------------------------------------------------");
        double totalCost = 0;
        for (int i = 0; i < books.length; i++) {
            totalCost =+ books[i].getPurchasesCost();
        }
        System.out.println("Current day income = " + totalCost);
        System.out.println("--------------------------------------------------------------------");
    }

}
