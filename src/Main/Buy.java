package Main;

import java.util.Scanner;

import Function.Function;

/**
 * Buy
 */
public class Buy extends Buku {
    private long book_price;
    private String type;
    private long sum;

    // private boolean check;
    public Buy(String title, String publisher, String type, long book_price) {
        super(title);
        this.type = type;
        this.publisher = publisher;
        this.book_price = book_price;
    }
    // set

    public void setBookPrice(long book_price) {
        this.book_price = book_price;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    // Get
    public long getBookPrice() {
        return book_price;
    }

    public long getSum() {
        return sum;
    }

    public String getType() {
        return type;
    }

    public boolean payCheck(long money) {
        if (money < this.getSum()) {
            return true;
        }

        return false;
    }

    public long setBookTotalPrice(int count) {
        long sum = this.getBookPrice() * count;
        this.setSum(sum);
        return this.getSum();
    }

    public void result(String fullname, int age, int count) {
        System.out.println("===================");
        System.out.println("FullName : " + fullname);
        System.out.println("Age : " + age);
        System.out.println("Book Title : " + this.title);
        System.out.println("Type : " + this.type);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("Price : " + this.book_price);
        System.out.println("Total Book : " + count);
        System.out.println("Total Price Book : " + this.setBookTotalPrice(count));
        System.out.println("===================");
    }

    public void info() {
        System.out.println("===================");
        System.out.println("Book Title : " + this.title);
        System.out.println("Type : " + this.type);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("Price : " + this.book_price);
        System.out.println("===================");
    }

    public void pay() {
        try (Scanner inputPay = new Scanner(System.in)) {
            System.out.print("Pay : ");
            long pay = inputPay.nextLong();
            if (!this.payCheck(pay)) {
                Function.clearScreen();
                System.out.println("================================== ");
                System.out.println("Money : " + pay);
                System.out.println("Total : " + this.getSum());
                long money_changes = pay - this.getSum();
                System.out.println("Money Changes : " + money_changes);
                System.out.println("================================== \n");
                Buy.sayThanks();
            } else {
                System.out.println("your input is wrong");
                System.out.println("try again !");
            }
        }
    }

    public static void sayThanks() {
        System.out.println("================================== ");
        System.out.println("Thank you for comming in Java OOP Library");
        System.out.println("================================== ");
    }
}