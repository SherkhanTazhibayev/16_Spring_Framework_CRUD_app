package stucture_realization;

import java.util.Arrays;


class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    //constructor
    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    //add
    public void add(E e) {
        if (size == elements.length) {
            increase_capacity();
        }
        elements[size++] = e;
    }

    //increase capacity
    private void increase_capacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}

