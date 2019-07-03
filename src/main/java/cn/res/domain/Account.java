package cn.res.domain;

import java.io.Serializable;

/**
 * @Author Rz
 * @Date 2019/6/27
 * @Time 11:44
 */
public class Account implements Serializable {
    private int id;
    private String name;
    private double money;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account() {

    }

    public Account(int id, String name, double money) {

        this.id = id;
        this.name = name;
        this.money = money;
    }
}
