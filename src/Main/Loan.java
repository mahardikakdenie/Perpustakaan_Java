
package Main;

import java.util.Scanner;

import Function.Function;

/**
 * Type
 */
public class Loan extends Buku {
    private String type;
    private String publisher;
    private long book_price;
    private long sum;
    private int day_borrow;
    private boolean check;

    public Loan(String title, String publisher, String type, long book_price) {
        super(title);
        this.type = type;
        this.publisher = publisher;
        this.book_price = book_price;
    }

    public void info() {
        System.out.println("================================== ");
        System.out.println("Title : " + Buku.title);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("Type : " + this.type);
        System.out.println("book price / week : " + this.book_price);
        System.out.println("================================== ");
    }

    public void result(String fullName, int age) {
        Function.clearScreen();
        System.out.println("================================== ");
        System.out.println("FullName : " + fullName);
        System.out.println("Age : " + age);
        System.out.println("Book Title : " + Buku.title);
        System.out.println("Day : " + this.getDay_borrow());
        System.out.println("Price : " + this.getSum());
        System.out.println("================================== ");
    }

    public void pay() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Pay : ");
            long money = input.nextLong();
            if (!this.payCheck(money)) {
                Function.clearScreen();
                System.out.println("================================== ");
                System.out.println("Money : " + money);
                System.out.println("Total : " + this.getSum());
                long money_changes = money - this.getSum();
                System.out.println("Money Changes : " + money_changes);
                System.out.println("================================== \n");
                this.sayThanks();
            } else {
                System.out.println("your input is wrong");
                System.out.println("try again !");
            }
        }
    }

    public void sayThanks() {
        System.out.println("================================== ");
        System.out.println("Thank you for comming in Java OOP Library");
        System.out.println("================================== ");
    }

    public boolean payCheck(long money) {
        if (money < this.getSum()) {
            return true;
        }

        return false;
    }

    public boolean payCheckFalse() {
        return false;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    public String getType() {
        return type;
    }

    public String getPublisher() {
        return publisher;
    }

    public long getBook_price() {
        return book_price;
    }

    public void setBook_price(long book_price) {
        this.book_price = book_price;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void setDay_borrow(int day_borrow) {
        this.day_borrow = day_borrow;
    }

    public int getDay_borrow() {
        return day_borrow;
    }

    public void sumPrice(int value) {
        long sum = this.book_price * value;
        this.setSum(sum);
        this.setDay_borrow(value);
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public boolean getCheck() {
        return this.check;
    }

}