package com.emreeker.dp.behavioral.iterator;

import java.util.NoSuchElementException;

public interface Iterator<E> {
	boolean hasNext();
	E next() throws NoSuchElementException;
}