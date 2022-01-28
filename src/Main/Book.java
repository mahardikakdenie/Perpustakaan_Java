/**
 * Buku
 */
package Main;

abstract class Book {
    protected String title;
    protected String publisher;
    // private Author author;

    public Book(String book_title) {
        this.title = book_title;
    }

    // Set
    public void setTitle(String title) {
        this.title = title;
    }

    // public void setAuthor(Author author) {
    // this.author = author;
    // }

    // Get
    public String getTitle() {
        return this.title;
    }

    // public Author getAuthor() {
    // return this.author;
    // }

}