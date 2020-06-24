package com.wb.architect.week03.n02.components;

import com.wb.architect.week03.n02.AbstractLeafComponent;

public class TextBox extends AbstractLeafComponent {

    private String content;
    public TextBox(String content) {
        this.content = content;
    }

    protected void printSelf(String content) {
        System.out.println("打印 TextBox(" + content + ")");
    }

    public String getContent() {
        return this.content;
    }
}
