package com.ds;
import java.util.Scanner;

public class MainClass {
    //main method
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insert(56);
        linkedList.insert(30);
        linkedList.insert(70);
        System.out.println("LinkList:");
        linkedList.print();
        linkedList.popLast();
        linkedList.print();
    }
}