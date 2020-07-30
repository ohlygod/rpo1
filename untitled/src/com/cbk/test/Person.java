package com.cbk.test;

public class Person implements Comparable<Person>{
    private String name;
    private Integer IdCard;
    private Integer money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdCard() {
        return IdCard;
    }

    public void setIdCard(Integer idCard) {
        IdCard = idCard;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
