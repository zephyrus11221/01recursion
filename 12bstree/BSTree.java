import java.util.*;
public class BSTree <T extends Comparable<T>>{
    private class Node{
	T data;
	Node left;
	Node right;
	int height = 1;
	public void set(T val){
	    data = val;
	}

	public T get(){
	    return data;
	}
	
	public void setLeft(Node n){
	    left = n;
	}
	
	public void setRight(Node n){
	    right = n;
	}
	
	public Node getLeft(){
	    return left;
	}
	
	public Node getRight(){
	    return right;
	}
	
	public int height(){
	    if (getLeft().height()>getRight().height()){
		return getLeft().height()+1;
	    }
	    return getRight().height()+1;
	}
	
	public void add(T value){
	    
	}
	
	public boolean contains(){
	    return data==null;
	}
	
	public String toString(){
	    String otpt = "";
	    return otpt;
	}
    }
}