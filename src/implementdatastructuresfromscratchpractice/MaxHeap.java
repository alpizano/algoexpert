package implementdatastructuresfromscratchpractice;

import java.util.Arrays;

public class MaxHeap {
    int size;
    int capacity;
    int[] array;

    public MaxHeap (int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        size = 0;
    }

    public int getLeftChild (int i) {
        return 2*i + 1;
    }

    public int getRightChild (int i) {
        return 2*i + 2;
    }

    public static int getParent(int i) {
        return (i - 1) / 2;
    }

    public void insert(int val) {
        ensureCapacity();
        array[size] = val;
        size++;

        // heapify
        heapifyUp();


    }

    public void heapifyUp() {
        // why
        while(getParent(size) >=0 && array[getParent(size)] < array[size]) {
            int temp = array[getParent(size)];
            array[getParent(size)] = array[size];
            array[size] = temp;

            size = getParent(size);
        }
    }

    public int extractMax() {
        // swap top and bottom node
        // delete last node in array (min), aka pop off stack
        // heapify down
        return array[0];
    }

    public void ensureCapacity() {
        int[] newArray;

        if(size == capacity) {
            array = Arrays.copyOf(array,size*2);
        }
    }
    public static void main(String[] args) {
        int[] sampleArray = new int[]{1,2,3,4,5};
        int[] sampleArray2 = Arrays.copyOf(sampleArray, 10*2);

        int size = 9;
        int[] sampleHeap = new int[]{42,29,18,14,7,18,12,11,13,35};

        // heapify up for insert 35 should be
        // compare(7,35) then compare ( 29,35) then compare (42,35)

        int levels = (int)Math.log(size+1);

        int index = size;
        int swapIndex = size;

        while(sampleHeap[getParent(index)] < sampleHeap[index]) {

            int temp = sampleHeap[getParent(index)];
            sampleHeap[getParent(index)] = sampleHeap[index];
            sampleHeap[index] = temp;

            index = getParent(index);
        }


        for(int i: sampleHeap) {
            System.out.print(i + " ");
        }

        // child -1
        System.out.println((-1-1)/2);
        // child 0
        System.out.println((0-1)/2);
        // child 1
        System.out.println((1-1)/2);
        // child 2
        System.out.println((2-1)/2);
        // child 3
        System.out.println((3-1)/2);
    }
}