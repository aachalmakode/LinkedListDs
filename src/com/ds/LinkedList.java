package com.ds;
public class LinkedList {

    Node head;

    class Node{
        Node next;
        int data;

        public Node(int data) {
            super();
            this.next = next;
            this.data = data;
        }
    }
    //append
    public Node insert(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return newNode;
    }

    //at head insert3
    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //uc 4method to insert at particular position
    public void addAtIndex(int value, int index) {
        if (index == 0) {
            insert(value);
        } else {
            Node  newNode = new Node(value);
            //newNode.value = value;
            Node nodeAtPreviousIndex = head;
            for (int i = 0; i < index - 1; i++) {
                nodeAtPreviousIndex = nodeAtPreviousIndex.next;
            }
            newNode.next = nodeAtPreviousIndex.next;
            nodeAtPreviousIndex.next = newNode;
        }
    }
    //uc5 delete the first elememt in the linklist
    public void  pop()
    {
        int popData = 0;
        if (head == null)
        {
            System.out.println("Stack is empty");
        }
        popData = head.data;
        head = head.next;

    }

    public void print()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }


}