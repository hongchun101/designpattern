package com.hongchun.designpattern.adpater;

/**
 * @author hongchun
 * @description PrintBanner
 * @date 2023/5/2 17:57
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
