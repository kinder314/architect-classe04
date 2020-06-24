package com.wb.architect.week03.n02.components;

import com.wb.architect.week03.n02.AbstractContainerComponent;

public class Frame extends AbstractContainerComponent {

    private String content;
    public Frame(String content) {
        this.content = content;
    }

    protected void printSelf(String content) {
        System.out.println("打印 Frame(" + content + ")");
    }

    public String getContent() {
        return this.content;
    }
}
