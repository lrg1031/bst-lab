package com.mycompany.bst_lab;

public class binarySearchTree {
    
    class Node {
        int data;
        Node left;
        Node right;
        Node(int d) {
            data = d;
            right = null;
            left = null;
        }
    }
    
    private Node root;
    private int length;
    
    public binarySearchTree() {
        root = null;
    }
    
    public void add(int item) {
        root = add(root, item);
    }
    
    //helper
    private Node add(Node tree, int item) {
        if(tree == null) {
            return new Node(item);
        }
        if(item < tree.data) {
            tree.left = add(tree.left, item);
        }
        else if(item > tree.data) {
            tree.right = add(tree.right, item);
        }
        return tree;
    }
    
    public void inOrder() {
        inOrder(root);
    }
    
    private void inOrder(Node tree) {
        if (tree != null) {
            inOrder(tree.left);
            System.out.println(tree.data);
            inOrder(tree.right);
        }
    }
    
    public boolean hasItem(int target) {
        return true;
    }
    
    public void preOrder() {
        
    }
    
    public void postOrder() {
        
    }
    
    public int sum() {
        return 0;
    }
    
    public void delete(int target) {
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
