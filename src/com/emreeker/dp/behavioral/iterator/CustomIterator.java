package com.emreeker.dp.behavioral.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomIterator<T> implements Iterator<T> {

    private T[] array;
    private int currentIndex;

    public CustomIterator(T[] array) {
        this.array = array;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public T next() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        return array[currentIndex++];
    }
}
