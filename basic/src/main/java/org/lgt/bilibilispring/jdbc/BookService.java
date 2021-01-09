package org.lgt.bilibilispring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/26 22:45
 **/
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addOrder(Order order) {
        bookDao.add(order);
        System.out.println("finish");
    }

    public void update(Order order) {
        bookDao.update(order);
    }

    public void delete(String id) {
        bookDao.delete(id);
    }

    public Order find(String id) {
        return bookDao.find(id);
    }

    public void findAll() {
        System.out.println(bookDao.findAll());
    }
}
