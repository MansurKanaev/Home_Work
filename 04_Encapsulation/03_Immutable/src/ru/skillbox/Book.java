package ru.skillbox;

public class Book {
    private final String nameBook;
    private final String nameAuthor;
    private final int numberPages;
    private final int numberISBN;

    public Book(String nameBook, String nameAuthor, int numberPages, int numberISBN) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.numberPages = numberPages;
        this.numberISBN = numberISBN;
    }
    public String getNameBook() {
        return nameBook;
    }
    public String getNameAuthor() {
        return nameAuthor;
    }
    public int getNumberPages() {
        return numberPages;
    }
    public int getNumberISBN() {
        return numberISBN;
    }
}
