/**
 * Buku
 */
package Main;

abstract class Buku {
    protected static String title;
    protected String publisher;
    // private Author author;

    public Buku(String book_title) {
        Buku.title = book_title;
    }

    // Set
    public void setTitle(String title) {
        Buku.title = title;
    }

    // public void setAuthor(Author author) {
    // this.author = author;
    // }

    // Get
    public String getTitle() {
        return Buku.title;
    }

    // public Author getAuthor() {
    // return this.author;
    // }

}