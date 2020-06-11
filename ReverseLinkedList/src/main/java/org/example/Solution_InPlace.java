package org.example;

public class Solution_InPlace {
    public static LinkedList reverseLinkedList(LinkedList head) {

        LinkedList cursor = head;
        LinkedList p1 = head;
        LinkedList p2
        LinkedList p3 =
       while(cursor != null) {

       }

        return head;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList(0);

        myList.next = new LinkedList(1);
        myList.next.next = new LinkedList(2);
        myList.next.next.next = new LinkedList(3);
        myList.next.next.next.next = new LinkedList(4);
        myList.next.next.next.next.next = new LinkedList(5);

        LinkedList newHead = myList;

        for (LinkedList cursor = myList; cursor != null; cursor = cursor.next) {
            System.out.print(cursor.value + " ");
        }

        System.out.println();

        LinkedList newList = Solution_InPlace.reverseLinkedList(myList);

        for (LinkedList cursor = newList; cursor != null; cursor = cursor.next) {
            System.out.print(cursor.value + " ");
        }

    }
}
