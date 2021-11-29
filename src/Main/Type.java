
package Main;

/**
 * Type
 */
public class Type extends Buku {
    private String type;
    private String publisher;

    public Type(String title, String publisher, String type) {
        super(title);
        this.type = type;
        this.publisher = publisher;
    }

    public void info() {
        System.out.println("================================== ");
        System.out.println("Title : " + this.title);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("Type : " + this.type);
        System.out.println("================================== ");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public String getPublisher() {
        return publisher;
    }
}