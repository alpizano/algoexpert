package implementdatastructuresfromscratchpractice;

public class Stack<E> {
    Node head;
    int size = 0;

    static class Node<T> {
        T val;
        Node next;

        public Node(T val) {
            this.val = val;
        }
    }

    public Stack() {

    }

    public boolean isEmpty() {
        return head == null;
    }

    public Stack push(E val) {
        if(head == null) {
            head = new Node(val);
            size++;
            return this;
        }

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;

        return this;
    }

    public <E> E pop(E val) {
        if(head == null) {
            throw new IllegalStateException("stack is empty");
        }

        Node temp = head;
        head = head.next;
        // cleanup reference
        temp.next = null;
        size--;

        return (E)temp.val;
    }
    public static void main(String[] args) {
            Stack intStack = new Stack();

            // throws exception
            intStack.pop(45);

    }
}
