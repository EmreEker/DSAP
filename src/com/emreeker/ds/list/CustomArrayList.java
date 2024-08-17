package com.emreeker.ds.list;

public class CustomArrayList<T> implements List<T> {

	private static final int DEFAULT_CAPACITY = 10;
	private T[] array;
	private int size = 0;

	@SuppressWarnings("unchecked")
	public CustomArrayList() {
		this.array = (T[]) new Object[DEFAULT_CAPACITY];
	}

	@SuppressWarnings("unchecked")
	public CustomArrayList(int initialCapacity) {
		if (initialCapacity <= 0) {
			throw new IllegalArgumentException("Capacity must be greater than zero.");
		}
		this.array = (T[]) new Object[initialCapacity];
	}

	@Override
	public void add(T element) {
		if (element == null) {
			throw new NullPointerException("Element cannot be null.");
		}
		array[size++] = element;
	}

	@Override
	public void addAll(List<T> elements) {
		if (elements == null || elements.isEmpty()) {
			return;
		}
		for (int i = 0; i < elements.size(); i++) {
			add(elements.get(i));
		}
	}

	@Override
	public boolean contains(T element) {
		for (int i = 0; i < size; i++) {
			if (array[i].equals(element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		array[--size] = null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isFull() {
		return size == array.length;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void reCreate() {
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[array.length * 2];
		System.arraycopy(array, 0, newArray, 0, size);
		array = newArray;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return array[index];
	}
}
