package org.lgt.bilibilispring.ioc;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/11/16 23:26
 **/
public class User {

    private String book;

    public void setBook(String book) {
        this.book = book;
    }

    public void hello() {
        System.out.println("you buy this book: " + book);
    }


}
