package com.emreeker.ds.list;

public interface List<T> {

	public void add(T element);
	
	public void addAll(List<T> elements);
	
	public boolean contains(T element);
	
	public void remove(int index);
	
	public int size();
	
	boolean isFull();
	
	boolean isEmpty();
	
	void reCreate();
	
	T get(int index);
}
