package com.hongchun.designpattern.factory;

/**
 * @author hongchun
 * @description Main
 * @date 2023/5/28 21:36
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product = factory.create("张三");
        product.use();
    }
}
