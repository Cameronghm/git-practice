package com.qa.com.qa;

public class TestBooks
{
    public static void main(String[] args)
    {
        String[] author1 = {"Greatest Author"};
        String[] author2 = {"Not so great Author"};
        String[] author12 = {"Greatest Author", "Not so great Author"};
        Book book1 = new Book("Greatest Book",author1,5.99);
        Book book2 = new Book("Not so great book", author2, 0.89);
        Book book3 = new Book("Best of both books", author12,10.99);
        Book[] books = {book1, book2, book3};

        for (int i = 0; i < books.length; i++)
        {
            System.out.println(books[i]);
        }

        for (Book book: books) {
            System.out.println(book);
        }

        Tree tree1 = new Tree("Oak", 56.4, 30);
        Tree tree2 = new Tree("Evergreen", 145.5, 60);
        Tree tree3 = new Tree("Spruce", 34.3, 10);
        Tree[] trees = {tree1, tree2, tree3};
        for (Tree tree: trees)
        {
            System.out.println(tree);
        }
    }
}
