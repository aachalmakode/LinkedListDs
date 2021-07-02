package com.ds;
 public class LinkedList {
  Node head;

  public void insert(int i) {
  }

  public void print() {
  }

  class Node {
   Node next;
   int data;

   //constructor
   public Node(int data) {
    super();
    this.next = next;
    this.data = data;
   }

   public Node insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
     head = newNode;
    } else {
     Node temp = head;
     while (temp.next != null) {
      temp = temp.next;
     }
     temp.next = newNode;
    }
    return newNode;
   }

   public void print() {
    Node temp = head;
    while (temp != null) {
     System.out.print(temp.data + " -> ");
     temp = temp.next;
    }
    System.out.println();
   }

  }
 }