package org.lgt.bilibilispring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/31 10:53
 **/
@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add() {
        String sql = "update orderliu set balance=balance+? where order_name=?";
        jdbcTemplate.update(sql, 100, "liu");
    }

    @Override
    public void recduce() {
        String sql = "update orderliu set balance=balance-? where order_name=?";
        jdbcTemplate.update(sql, 100, "why");
    }
}
