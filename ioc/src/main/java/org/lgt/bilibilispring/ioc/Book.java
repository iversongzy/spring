package org.lgt.bilibilispring.ioc;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/11/25 23:20
 **/
public class Book {
    private String author;
    private int price;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void show() {
        System.out.printf("This book author is %s, price is %d", author, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
