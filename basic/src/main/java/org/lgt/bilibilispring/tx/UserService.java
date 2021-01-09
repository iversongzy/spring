package org.lgt.bilibilispring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/31 10:54
 **/
@Service
//@Transactional
public class UserService {

    @Autowired
    private OrderDao orderDao;

    public void transfer() {
        orderDao.add();
        int a = 1 / 0;
        orderDao.recduce();
    }
}
