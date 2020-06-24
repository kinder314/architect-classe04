package com.wb.architect.week03.n02.components;

import com.wb.architect.week03.n02.AbstractLeafComponent;

public class Label extends AbstractLeafComponent {

    private String content;
    public Label(String content) {
        this.content = content;
    }

    protected void printSelf(String content) {
        System.out.println("打印 Label(" + content + ")");
    }

    public String getContent() {
        return this.content;
    }
}
