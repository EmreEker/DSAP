package com.emreeker.ds.list;

public class CustomArrayList <T> implements List<T> {

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAll(List<T> elements) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reCreate() {
		// TODO Auto-generated method stub
		
	}
}
