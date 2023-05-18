package com.hongchun.designpattern.template;

/**
 * @author hongchun
 * @description Main
 * @date 2023/5/3 8:27
 */
public class Main {

    public static void main(String[] args) {
        AbstractDisplay display = new CharDisplay('H');
        display.display();
    }
}
