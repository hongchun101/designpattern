package com.hongchun.designpattern.adpater;

/**
 * @author hongchun
 * @description Banner
 * @date 2023/5/2 17:35
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
