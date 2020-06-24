package com.wb.architect.week03.n02.components;

import com.wb.architect.week03.n02.AbstractContainerComponent;

public class WinForm extends AbstractContainerComponent {

    private String content;
    public WinForm(String content) {
        this.content = content;
    }

    protected void printSelf(String content) {
        System.out.println("打印 WinForm(" + content + ")");
    }

    public String getContent() {
        return this.content;
    }
}
