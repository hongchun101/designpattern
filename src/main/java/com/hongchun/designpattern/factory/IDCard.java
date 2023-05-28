package com.hongchun.designpattern.factory;

/**
 * @author hongchun
 * @description IDCard
 * @date 2023/5/28 21:32
 */
public class IDCard extends Product {

    public String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的idcard");
        this.owner = owner;
    }

    @Override
    void use() {
        System.out.println("使用" + owner + "的idcard");
    }

    public String getOwner() {
        return owner;
    }
}
