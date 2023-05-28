package com.hongchun.designpattern.factory;

/**
 * @author hongchun
 * @description Factory
 * @date 2023/5/28 21:30
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
