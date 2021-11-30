package com.jw.qiu.entity;

public class Payment {
    private Integer id;

    private String payserno;

    public Payment(Integer id, String payserno) {
        this.id = id;
        this.payserno = payserno;
    }

    public Payment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayserno() {
        return payserno;
    }

    public void setPayserno(String payserno) {
        this.payserno = payserno == null ? null : payserno.trim();
    }
}