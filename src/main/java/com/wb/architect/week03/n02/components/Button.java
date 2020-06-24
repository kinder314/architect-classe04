package com.wb.architect.week03.n02.components;

import com.wb.architect.week03.n02.AbstractLeafComponent;

public class Button extends AbstractLeafComponent {

    private String content;
    public Button(String content) {
        this.content = content;
    }

    protected void printSelf(String content) {
        System.out.println("打印 Button(" + content + ")");
    }

    public String getContent() {
        return this.content;
    }
}
