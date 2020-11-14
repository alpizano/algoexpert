package implementdatastructuresfromscratchpractice;

public class DoublyLinkedList {
    static class Node {
        int val;
        Node next;
        Node prev;

        Node (int val) {
            this.val = val;
        }

        Node (int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head;
    Node tail;

    public DoublyLinkedList(int val) {
        head = new Node(val, null, head);
        tail = head;
    }

    public DoublyLinkedList addToHead(int val) {
        if(head == null) {
            head = new Node(val, null, null);
            tail = head;
            return this;
        }

        // if 1st node, don't need to point prev to head or it becomes cyclic
        Node newNode = new Node(val, head, null);
        //newNode.next = head;
        head.prev = newNode;
        head = newNode;

        return this;
    }

    public DoublyLinkedList addToTail(int val) {
        // if head is null
        if(head == null) {
            head = new Node(val, null, null);
            tail = head;
            return this;
        }

        tail.next = new Node(val, null, tail);
        tail = tail.next;

        return this;
    }

    public void deleteFromTail(int val) {

    }

//    public DoublyLL addToTail(int val) {
//        if(head ==null) {
//            head = new Node(val);
//            return this;
//        }
//        Node cursor = head;
//        while(cursor.next != null) {
//            cursor = cursor.next;
//        }
//
//       // cursor.next = new Node(val, null,
//        return this;
//    }

    public void print(){
        for(Node cursor = head; cursor != null; cursor = cursor.next) {
            System.out.print(cursor.val + " ");
        }
    }

    public static void main(String[] args) {
        // 5 -> 25 -> 50 -> 100
        //DoublyLL testAddToHead = new DoublyLL(100).addToHead(50).addToHead(25).addToHead(5);
        //testAddToHead.print();

        // 9 -> 3 -> 1 -> 25 -> 42 -> 55
        DoublyLinkedList testAddToTail = new DoublyLinkedList(1).addToHead(3).addToHead(9).addToTail(25).addToTail(42).addToTail(55);
        testAddToTail.print();
    }
}
