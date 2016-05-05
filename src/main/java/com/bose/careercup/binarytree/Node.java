package com.bose.careercup.binarytree;

/**
 * Created by JeetBose on 5/5/16.
 */
public class Node<T> {

    T value;
    Node left;
    Node right;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
