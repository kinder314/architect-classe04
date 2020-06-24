package com.wb.architect.week03.n02;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractContainerComponent implements Container {

    private List<Component> componentList = new LinkedList<Component>();
    public void add(Component component) {
        componentList.add(component);
    }

    public void print() {
        printSelf(getContent());
        for(Component component : componentList) {
            component.print();
        }
    }

    protected abstract void printSelf(String name);
}
