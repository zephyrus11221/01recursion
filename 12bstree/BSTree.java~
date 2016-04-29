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
	    if (left.height()>right.height()){
		return getLeft().height()+1;
	    }
	    return getRight().height()+1;
	}
	
	public void add(T value){
	    if(data.compareTo(value)<0){
		if (left==null){
		    left.set(value);
		}else{
		    left.add(value);
		}
	    }else{
		if (right==null){
		    right.set(value);
		}else{
		    right.add(value);
		}
	    }
	}
	
	public boolean contains(){
	    return data==null;
	}
	
	public String toString(){
	    String otpt = "";
	    if (left==null&&right!=null){
		otpt+=data+right.toString();
	    }else if (right==null){
		otpt+=data+left.toString();
	    }
	    if (left==null&&right==null){
		otpt+=data;
	    }
	    return otpt;
	}
    }
}