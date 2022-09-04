package com.intellijide.hashtable;

public class MyLinkedList<K,V> {
    MyMapNode<K,V> head;
    MyMapNode<K,V> tail;

    public void append(MyMapNode<K, V> myMyMapNode) {
        if (head == null) {
            head = myMyMapNode;
            tail = myMyMapNode;
        } else {
            this.tail.setNext(myMyMapNode);
            this.tail = myMyMapNode;
        }
    }
    public MyMapNode<K, V> searchMyMapNode(K data) {
        MyMapNode<K, V> temp = head;
        int position = 0;
        while (temp != null) {
            if (temp.getKey().equals(data)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return temp;
    }
    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
