package com.intellijide.hashtable;

public class HashTableMain {

    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        String str = "To be or not to be";
        String[] strArray = str.toLowerCase().split(" ");
        for (String word : strArray) {
            hashTable.get(word);
            Integer value = hashTable.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;
            hashTable.add(word,value);
        }
        System.out.println(hashTable);
    }
}
