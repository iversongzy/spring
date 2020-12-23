package org.lgt.bilibilispring.ioc.bean.xml.lifecycle;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/1 0:00
 **/
public class Controller {

    public Controller() {
        System.out.println("1st Step");
    }

    public void initMethod() {
        System.out.println("3rd Step");
    }

    public void destroyMethod() {
        System.out.println("5th Step");
    }

    private String domain;

    public void setDomain(String domain) {
        this.domain = domain;
        System.out.println("2nd Step");
    }
}
