package org.example;

public class Solution_InPlace {
    public static LinkedList reverseLinkedList(LinkedList head) {

        LinkedList p1 = head; // points to 0
        LinkedList p2 = p1.next; // points to 1
        LinkedList tmp = p2.next; // points to 2

       while(p2 != null) {

           // Point node in reverse
            p2.next = p1;

           if(p1 == head) {
               head.next =null;
           }

           // Shift nodes
           p1 = p2;
           p2 = tmp;
           if(tmp != null) {
               tmp = tmp.next;
           }

       }
       // Switch head reference
       head = p1;

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
