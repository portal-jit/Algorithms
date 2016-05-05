package com.bose.careercup.binarytree;

/**
 * Created by JeetBose on 5/5/16.
 */
public class TreeOps {

    Node head;

    public TreeOps(){
        this.head = new Node();

    }

    public void inorder(Node root){

        if(root != null){

            inorder(root.getLeft());
            System.out.println(root.getValue().toString());
            inorder(root.getRight());

        }

    }

    public void postorder(Node root){

        if(root != null){

            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.println(root.getValue().toString());

        }

    }

    public void preorder(Node root){

        if(root != null){

            System.out.println(root.getValue().toString());
            preorder(root.getLeft());
            preorder(root.getRight());

        }

    }



}
