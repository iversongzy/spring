package org.lgt.spring.ioc.domain;

import org.lgt.spring.ioc.annotation.Super;

/**
 * @Description
 * @Author liuguotai
 * @Date2021/1/9 19:59
 **/
@Super
public class SuperUser extends User {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
