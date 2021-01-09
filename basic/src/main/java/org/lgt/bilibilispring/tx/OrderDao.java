package org.lgt.bilibilispring.tx;

import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/31 10:53
 **/
public interface OrderDao {

    void add();

    void recduce();
}
