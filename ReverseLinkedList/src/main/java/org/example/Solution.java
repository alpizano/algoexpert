package org.example;


public class Solution
{
    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList helper = head;
        LinkedList node;

        for(LinkedList cursor = head; cursor != null; cursor=cursor.next) {
            node = new LinkedList(cursor.value);
            node = helper;
            helper = node;
        }

        return helper;
    }

    static class LinkedList {
        int value;
        LinkedList next;

        public LinkedList(int value) {
            this.value=value;
            next = null;
        }
    }
    public static void main( String[] args )
    {
        LinkedList myList = new LinkedList(0);
        myList.next = new LinkedList(1);
        myList.next.next = new LinkedList(2);
        myList.next.next.next = new LinkedList(3);
        myList.next.next.next.next = new LinkedList(4);
        myList.next.next.next.next.next = new LinkedList(5);

        for(LinkedList cursor = myList; cursor != null; cursor=cursor.next) {
            System.out.print(cursor.value + " ");
        }



    }
}
