package org.lgt.bilibilispring.ioc;

import java.util.List;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/11/30 20:52
 **/
public class Dependency {
    private String name;
    private int peopleNum;
    private List<Employee> employees;

    public void setName(String name) {
        this.name = name;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void show() {
        System.out.println( "Dependency{" +
                "name='" + name + '\'' +
                ", peopleNum=" + peopleNum +
                ", employee=" + employees +
                '}');
    }

}
