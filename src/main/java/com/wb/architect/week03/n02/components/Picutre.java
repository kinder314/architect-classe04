package com.wb.architect.week03.n02.components;

import com.wb.architect.week03.n02.AbstractLeafComponent;

public class Picutre extends AbstractLeafComponent {

    private String content;
    public Picutre(String content) {
        this.content = content;
    }

    protected void printSelf(String content) {
        System.out.println("打印 Picutre(" + content + ")");
    }

    public String getContent() {
        return this.content;
    }
}
