package org.lgt.bilibilispring.ioc;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/11/30 20:55
 **/
public class Employee {
    private String name;
    private int index;

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}
