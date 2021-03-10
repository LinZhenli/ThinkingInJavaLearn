package test;

import java.util.ArrayList;

public class StackArrayList<T> {
    private ArrayList<T> as=new ArrayList<T>();
    public void push(T t){
        as.add(t);
    }
    public T pop(){
        return as.remove(as.size()-1);
    }
    public T peek(){
        if(as != null && as.size() > 0) {
             return as.get(as.size() - 1);
    }
        return null;
    }

    public  boolean isEmpty(){
        return as.isEmpty();
    }
}
