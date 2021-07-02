package com.ds;
import com.ds.LinkedList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(56);
        linkedList.insert(30);
        linkedList.insert(70);
        System.out.println("LinkedList:");
        linkedList.print();
        linkedList.pop();//pop the first element of the list
        linkedList.print();


    }
}