package com.hongchun.designpattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongchun
 * @description IDCardFactory
 * @date 2023/5/28 21:34
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        String owner = ((IDCard) product).getOwner();
        owners.add(owner);
    }
}
