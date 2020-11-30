package org.lgt.bilibilispring.ioc;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/1 0:18
 **/
public class MyFactoryBean implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setAuthor("lgt");
        book.setPrice(100);
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public String toString() {
        return "MyFactoryBean{}";
    }
}
