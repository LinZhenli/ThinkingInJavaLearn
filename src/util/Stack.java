package util;

import java.util.LinkedList;

//Making a stack from a LinkedList.

public class Stack<T> {
	private LinkedList<T> storage=new LinkedList<T>();
	public void push(T v) {storage.addFirst(v);}
	public T peek() {return storage.getFirst();}
	public T pop() {return storage.removeFirst();}
	public boolean empty() {return storage.isEmpty();}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return storage.toString();
	}
}
