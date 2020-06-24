package com.wb.architect.week03.n02;

public abstract class AbstractLeafComponent implements Component{

    public void print() {
        printSelf(getContent());
    }

    protected abstract void printSelf(String name);
}
