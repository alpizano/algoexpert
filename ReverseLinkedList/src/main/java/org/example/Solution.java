package org.example;


public class Solution
{
    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList tmp = null;
        LinkedList newHead = null;
        //System.out.println("helper.value is: " + newHead.value);


        int count = 0;

        // Not in place
        for(LinkedList cursor = head; cursor != null; cursor=cursor.next) {
                tmp = new LinkedList(cursor.value);
                tmp.next = newHead;
                newHead = tmp;

        }
//        LinkedList cursor = head;
//        while(cursor != null) {
//            cursor.next = tmp;
//                tmp = cursor;
//        }
//        head.next = null;

        return newHead;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value=value;
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

        LinkedList newHead = myList;

        for(LinkedList cursor = myList; cursor != null; cursor=cursor.next) {
            //System.out.print(cursor.next.value + " ");
           // System.out.print(cursor.next.value + " ");
        }

        System.out.println();

        LinkedList newList = Solution.reverseLinkedList(myList);

        for(LinkedList cursor = newList; cursor != null; cursor=cursor.next) {
            System.out.print(cursor.value + " ");
        }



    }
}
