package main.java.tree;

import java.util.ArrayList;

public class Tree<T> {

    public T name;
    public Integer value;
    public Tree<T> parent;
    public ArrayList<Tree<T>> children = new ArrayList<Tree<T>>();
    private Integer data;

    public Tree(T name, int value) {
        this.name = name;
        this.value = value;
        this.setData(0);
    }

    public Tree<T> addChild(T child, Integer value) {
        Tree<T> childnode = new Tree<T>(child, value);
        childnode.parent = this;
        this.children.add(childnode);
        return childnode;
    }

    public ArrayList<Tree<T>> getChildren() {
        return children;
    }

    public Boolean hasChildren() {
        return this.children.size() > 0;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
