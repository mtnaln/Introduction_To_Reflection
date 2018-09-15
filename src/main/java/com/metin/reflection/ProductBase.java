package com.metin.reflection;

public class ProductBase {

    private Long id;

    public ProductBase(){

    }

    public ProductBase(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductBase{" +
                "id=" + id +
                '}';
    }
}
