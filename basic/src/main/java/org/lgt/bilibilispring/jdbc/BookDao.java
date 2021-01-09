package org.lgt.bilibilispring.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/26 22:45
 **/
public interface BookDao {
    void add(Order order);

    Order find(String id);

   List<Order> findAll();

    void update(Order order);

    void delete(String id);
}
