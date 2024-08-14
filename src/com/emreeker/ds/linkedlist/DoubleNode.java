package com.emreeker.ds.linkedlist;

public class DoubleNode<T>  {
 private T data;
 DoubleNode<T> next;
 DoubleNode<T> previous;
 
 public DoubleNode(T data) {
	 this.data=data;
	 next=null;
	 previous=null;
 }
 
 
}
