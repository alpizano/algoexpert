package org.example;

public class Solution_InPlace {
    public static LinkedList reverseLinkedList(LinkedList head) {

        // Handling edge case where input is just 1 node
        if(head.next == null) {
            return head;
        }

        LinkedList p1 = head; // points to 0
        LinkedList p2 = p1.next; // points to 1
        LinkedList tmp = p2.next; // points to 2

       while(p2 != null) {

           // Point node in reverse
            p2.next = p1;

            // Null out first nodes next reference or infinite cyclic loop
           if(p1 == head) {
               head.next =null;
           }

           // Shift nodes
           p1 = p2;
           p2 = tmp;

           // If tmp is already at null, make sure not to increment it anymore
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
