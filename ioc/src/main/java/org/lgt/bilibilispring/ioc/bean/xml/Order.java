package org.lgt.bilibilispring.ioc.bean.xml;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/11/25 23:30
 **/
public class Order {
    private String name;
    private String address;

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void show() {
        System.out.printf("the address of this order:%s is %s",name, address);
    }
}
