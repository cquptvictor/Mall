package com.cqupt.zyx.domain.beanForBackstage;

import java.util.List;

public class Order {
    private List<Product> products;
    private int oid;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
