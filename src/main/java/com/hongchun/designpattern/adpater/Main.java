package com.hongchun.designpattern.adpater;

/**
 * @author hongchun
 * @description Main
 * @date 2023/5/2 17:58
 */
public class Main {

    public static void main(String[] args) {
        PrintBanner p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
