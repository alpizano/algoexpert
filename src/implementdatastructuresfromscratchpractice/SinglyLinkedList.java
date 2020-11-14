package implementdatastructuresfromscratchpractice;

public class SinglyLinkedList {
    Node head;
    int size =0;

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public SinglyLinkedList(int val) {
        head = new Node(val, null);
        size++;
    }

    // allows for chaining of .addToHead() etc...
    public SinglyLinkedList addToHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
        size++;

        return this;
    }

    public boolean contains(int val) {
        for(Node cursor = head; cursor != null; cursor = cursor.next) {
            if(cursor.val == val) {
                return true;
            }
        }

        return false;
    }

    public boolean remove(int val) {
        if(head.val == val) {
            head = head.next;
            size--;
            return true;
        }

        Node prev = head;
        for(Node curr = head.next; curr != null; curr = curr.next) {
            if(curr.val == val) {
                prev.next = curr.next;
                size--;
                return true;
            }
            prev = prev.next;
        }

        return false;
    }

    public void clear() {
        head = null;
    }

    public SinglyLinkedList addToTail(int val) {
        if(head == null) {
            head = new Node(val);
            size++;
            return this;
        }

        //Node cursor = head;
        for(Node cursor = head; cursor != null; cursor = cursor.next) {
            if(cursor.next == null) {
                cursor.next = new Node(val);
                // do you always need a break:
                size++;
                break;
            }
        }

        return this;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        for(Node cursor = head; cursor != null; cursor = cursor.next) {
            System.out.print(cursor.val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedList head = new SinglyLinkedList(10).addToHead(20).addToHead(30).addToHead(40);

//        SinglyLL head = new SinglyLL(10);
//        head.addToHead(20);
//        head.addToHead(30);
//        head.addToHead(40);
        head.print();

        head.addToTail(69).addToTail(72).addToTail(99);
//        head.addToTail(72);
//        head.addToTail(99);
        head.print();
        System.out.println(head.getSize());

        System.out.println(head.contains(1));
        System.out.println(head.contains(-1));
        System.out.println(head.contains(69));
        System.out.println(head.contains(99));
        System.out.println(head.contains(40));

        head.remove(10);
        head.remove(99);
        head.remove(40);
        head.print();
        System.out.println(head.getSize());
    }
}