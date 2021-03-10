package session11HoldingYourObject;

import test.StackArrayList;
import util.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack<String> stack=new Stack<String>();//这样的stack已经过时
		Deque<String> stack=new ArrayDeque<>();

		for (String string : "My dog has fleas".split(" ")) {
			stack.push(string);
		}
		while(!stack.isEmpty())
			System.out.println(stack.pop()+" ");
		System.out.println("----------------");

		StackArrayList<String> st=new StackArrayList<String>();
		for (String string : "My dog has fleas".split(" ")) {
			st.push(string);
		}
		while(!st.isEmpty())
			System.out.println(st.pop()+" ");
	}

}
