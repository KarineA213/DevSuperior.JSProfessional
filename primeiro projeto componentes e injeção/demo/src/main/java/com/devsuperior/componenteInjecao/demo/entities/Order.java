package com.devsuperior.componenteInjecao.demo.entities;



public class Order {

    private int code;
    private double basic;
    private double discount;

    public Order() {

    }

    public Order(double basic, double discount, int code) {
        this.basic = basic;
        this.code = code;
        this.discount = discount;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
