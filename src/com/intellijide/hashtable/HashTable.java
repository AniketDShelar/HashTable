package com.intellijide.hashtable;

import java.util.List;

public class HashTable<K,V> {
    MyLinkedList<K,V> list = new MyLinkedList<>();
    public void add(K key, V value) {
        MyMapNode<K, V> myMyMapNode = list.searchMyMapNode(key);
        if (myMyMapNode == null) {
            myMyMapNode = new MyMapNode<K, V>(key, value);
            list.append(myMyMapNode);
        } else {
            myMyMapNode.setValue(value);
        }
    }
    // Searching for the word and get the value from the linked list
    public V get(K word) {
        MyMapNode<K, V> myMapMyMapNode = list.searchMyMapNode(word);
        if (myMapMyMapNode == null) {
            return null;
        } else {
            return myMapMyMapNode.getValue();
        }

    }

    @Override
    public String toString() {
        return "HashTable{" +
                "list=" + list +
                '}';
    }
}










// Append the value in the linked list
//    public void append(MyMapNode<K, V> myMyMapNode) {
//        if (this.head == null)
//            this.head = myMyMapNode;
//        if (this.tail == null)
//            this.tail = myMyMapNode;
//        else {
//            this.tail.setNext(myMyMapNode);
//            this.tail = myMyMapNode;
//        }
//    }

// Searching for the word in the linked list
//    public MyMapNode<K, V> searchMyMapNode(K data) {
//        MyMapNode<K, V> currentMyMapNode = head;
//        int position = 0;
//        while (currentMyMapNode != null) {
//            position++;
//            if (currentMyMapNode.getKey().equals(data)) {
//                return currentMyMapNode;
//            }
//            currentMyMapNode = currentMyMapNode.getNext();
//        }
//        return currentMyMapNode;
//    }
