package org.lgt.bilibilispring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/26 22:45
 **/
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Order order) {
        String sql = "insert into orderliu values(?,?,?)";
        Object[] args = {order.getNum(), order.getDate(), order.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public Order find(String id) {
        String sql = "select * from orderliu where order_id=?";
        Order order = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Order.class), id);
        return order;
    }

    @Override
    public List<Order> findAll() {
        String sql = "select * from orderliu";
        List<Order> orders = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Order.class));
        return orders;
    }

    @Override
    public void update(Order order) {
        String sql = "update orderliu set order_data=?, order_name=? where order_id=?";
        Object[] args = {order.getDate(), order.getNum(), order.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from orderliu where order_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }


}
