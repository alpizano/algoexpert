package implementdatastructuresfromscratchpractice;

import java.util.Arrays;

public class DynamicArray<E> {
    int size;
    private final int CAPACITY = 10;
    Object[] array;

    public DynamicArray() {
        array = new Object[CAPACITY];
        size = 0;
    }

    public DynamicArray(int capacity) {
        array = new Object[capacity];
        size = 0;
    }

    public void add(E val) {
        ensureCapacity();
        array[size] = val;
    }

    public void ensureCapacity() {
        if(size == CAPACITY) {
            array = Arrays.copyOf(array, CAPACITY*2);
        }
    }

    public E get(int index) {
        return (E) array[index];
    }

    public void set(int index, E val) {
        array[index] = val;
    }

    public int indexOf(E obj) {
        for(int i=0; i<array.length; i++) {
            if(obj.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public E remove(int index) {
        return E;
    }

    public static void main(String[] args) {

    }
}
