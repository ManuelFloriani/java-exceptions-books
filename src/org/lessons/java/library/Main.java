package org.lessons.java.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Apro uno scanner da tastiera
        Scanner scan = new Scanner(System.in);
//        Chiedo all'utente quanti libri vorrà inserire
        System.out.println("How many books do you want to enter?");
//        Assegno alla variabile bookQuantity il valore che mi passa l'utente
        int bookQuantity = Integer.parseInt(scan.nextLine());
//        Creo un array di dimensione uguale al valore passato dall'utente
        Book[] books = new Book[bookQuantity];

        try {
            for (int i = 0; i < bookQuantity; i++) {
                System.out.println("Insert the title for the " + (i+1) + "° book: ");
                String title = scan.nextLine();
                System.out.println("Insert the number of pages: ");
                int pages = Integer.parseInt(scan.nextLine());
                System.out.println("Insert the complete name of the author: ");
                String author = scan.nextLine();
                System.out.println("Insert the editor: ");
                String editor = scan.nextLine();
                Book book = new Book(title, pages, author, editor);
                books[i] = book;
                System.out.println("Book inserted successfully.");
                System.out.println("-------------------");
            }
            System.out.println("Book's list: 1");
            for (int i = 0; i < bookQuantity; i++) {
                Book book = books[i];
                System.out.println("Book #" + (i + 1) + ": ");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Pages: " + book.getPages());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Editor: " + book.getEditor());
                System.out.println("-------------------");
            }
        } catch (Book.TitleEmptyException e) {
            System.out.println(e.getMessage());
        } catch (Book.PagesNonPositiveException e){
            System.out.println(e.getMessage());
        } catch (Book.AuthorEmptyException e){
            System.out.println(e.getMessage());
        } catch (Book.EditorEmptyException e){
            System.out.println(e.getMessage());
        }




//        chiudo lo scanner da tastiera
        scan.close();
    }
}
