package org.lgt.bilibilispring.ioc.bean.xml.autowire;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/1 0:27
 **/
public class Father {
    private Son son;

    public void setSon(Son son) {
        this.son = son;
    }

    @Override
    public String toString() {
        return "Father{" +
                "son=" + son +
                '}';
    }
}
