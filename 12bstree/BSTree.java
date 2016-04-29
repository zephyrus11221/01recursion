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
	
	public boolean contains(T value){
	    if (data==value){
		return true;
	    }
	    if (data.compareTo(value)<0){
		if (left==null){
		    return false;
		}else{
		    return left.contains(value);
		}
	    }else{
		if (right==null){
		    return false;
		}else{
		    return right.contains(value);
		}
	    }
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
    
    private Node root;

    //OUTER methods here are wrapper methods for the root
    
    public boolean isEmpty(){
	return root==null;
    }
    public int getHeight(){
	if (isEmpty()){
	    return 0;
	}
	//check for empty first!
	return root.height();
    }

    public void add(T value){
	if (!isEmpty()){
	    root.add(value);
	}
    }
    public String toString(){
	if (isEmpty()){
	    return "";
	}
 //check for empty before you do things with root.
	return root.toString();
    }
    public boolean contains(T value){
	if (isEmpty()){
	    return false;
	}
	return root.contains(value);
    }
    
    
    
}