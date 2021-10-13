package Controller;

import Entity.Author;
import Entity.Book;
import Entity.Genre;

import java.util.ArrayList;

public class BookService {

    // return a list of books written by provided author
    //Create a method that finds a book profided by aythor
    // create new array list of books "authorbooks"
    //loop through the books in the book list
    // if profided author is among the authors od the current book, then add book to list of authorBooks created
    // if(author belongs to any of the authors in Book.getauthors
    //After lloop ic complete run array list of authorBooks

    public ArrayList<Book> listOfBooksByAuthor(Author author) {
        //Arraylist for storing books that are written by provided autohr
        ArrayList<Book> authorBooks = new ArrayList<>();

        //Loops through the booklist to find books with the author in the list of authors
        for (Book book : bookList) {
            //loops thorugh th list of authors to see if provided author is among the list
            for (Author author1 : book.getAuthors()) {
                if (author.equals(author1)) {
                    authorBooks.add(book);
                }
            }
        }
        return authorBooks;
    }

    ArrayList<Book> bookList;

    BookService() {
        this.bookList = new ArrayList<Book>();
    }

    //adding books to list
    public void addBook(Book book) {
        this.bookList.add(book);
    }

    //Removing books from the list
    public void removeBook(Book book) {
        this.bookList.remove(book);
    }

    //returning a list of all books
    public ArrayList<Book> returnListOfBooks() {
        return this.bookList;
    }

    // returning a list of books by Fantasy type
    public ArrayList<Book> listByTypeFantasy() {
        ArrayList<Book> booksByFantasy = new ArrayList<>();

        for (Book book : bookList) {
            if (book.getGenre().equals(Genre.FANTASY)) {
                booksByFantasy.add(book);
            }
        }
        return booksByFantasy;

    }

// returning a list of books released before 1999


    public ArrayList<Book> listOfBooksBefore1999() {
        ArrayList<Book> booksBefore1999 = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getYearOfRelease() < 999) {
                booksBefore1999.add(book);
            }
        }
        return booksBefore1999;
    }

    //returning the most expensive book
    public Book mostExpensiveBook() {
        Book mostExpensive = bookList.get(0);

        for (Book book : bookList) {
            if (book.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }
    // returning the cheapest book

    public Book cheapestBook() {
        Book cheapest = bookList.get(0);
        for (Book book : bookList) {
            if (book.getPrice() < cheapest.getPrice()) {
                cheapest = book;
            }
        }
        return cheapest;
    }

    //returning a book writen b three authors
    public Book bookOfThreeAuthors() {
        for (Book book : bookList) {
            if (book.getAuthors().size() == 3) {
                return book;
            }
        }
        return null;
    }

    //verifying if a book is on the list
    public Boolean verifyIfOnList(Book book) {
        return bookList.contains(book);
    }

    //returning a list of books written by provided author
    public Book writtenByAuthor() {
        ArrayList<Book> byAuthor = new ArrayList<>();
        Book providedAuthor = bookList.get(0);
        for (Book book : bookList) {
            if (book.getAuthor().equals(providedAuthor)) {
                providedAuthor = book;
            }

        }
        return providedAuthor;
    }
}
