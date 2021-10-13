package Entity;

import java.util.ArrayList;

public class Book {
    String title;
    double price;
    int yearOfRelease;
    Genre genre;
    Author author;
    ArrayList<Author> authorList;

    Book(String title, double price, int yearOfRelease, Genre genre, Author author) {
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.authorList = new ArrayList<Author>();
    }
    public ArrayList<Author> getAuthors() {
        return this.authorList;
    }
    void updateAuthors(Author  author) {
        authorList.add(author);
    }

    public String toString () {
        return "Book title: " + title +
                "\nBook price: " + price +
                "\n Year of release: " + yearOfRelease +
                "\n genre: " + genre;
    }

    public void addAuthor(Author author){
        authorList.add(author);

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public java.util.ArrayList<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(java.util.ArrayList<Author> authorList) {
        this.authorList = authorList;
    }

}
