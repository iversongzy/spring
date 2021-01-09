package org.lgt.bilibilispring.jdbc;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/26 22:54
 **/
public class Order {
    private String num;
    private String date;
    private String id;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "num='" + num + '\'' +
                ", date='" + date + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
