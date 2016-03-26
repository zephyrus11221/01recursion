import java.util.*;
import java.lang.UnsupportedOperationException;
public class MyLinkedList <T> implements Iterable<T>{
    private class LLIterator implements Iterator<T>{
	private LNode next;

	public LLIterator(){
	    next = start;
	}

	public boolean hasNext(){
	    return next!=null;
	}

	public T next(){
	    if(!hasNext()){
		throw new NoSuchElementException();
	    }
	    T ret = next.get();
	    next=next.nextNode();
	    return ret;
	}

	public void remove(){
	    throw new UnsupportedOperationException();
	}

    }
    
    public Iterator<T> iterator(){
	return new LLIterator();
    }

    private class LNode{
	private T value;
	private LNode next;

	public LNode(){
	}

	public LNode(T val){
	    value=val;
	}

	public T get(){
	    return value;
	}

	public void set(T val){
	    value=val;
	}

	public LNode nextNode(){
	    return next;
	}    
	
	public void setNext(LNode node){
	    next = node;
	}

    }

    private LNode start;
    private int size=1;
    private LNode end;

    public int size(){
	return size;
    }

    public T get(int index){
	int x = 0;
	LNode current = start;
	while (x<index){
	    current = current.nextNode();
	    x++;
	}
	return current.get();
    }

    public T set(int index, T newValue){
	if(index<0 || index>=size){
	    throw new IndexOutOfBoundsException();
	}	
	LNode current = start;
	int x = 0;
	while (x<index){
	    current = current.nextNode();
	    x++;
	}
	T otpt = current.get();
	current.set(newValue);
	return otpt;
    }
    
    public boolean add(int index, T value){
	if(index<0 || index>size){
	    throw new IndexOutOfBoundsException();
	}	

	LNode current = start;
	int x = 0;
	if(index==0){
	    LNode add = new LNode(value);
	    add.setNext(start);
	    start = add;
	    size++;
	    return true;
	}
	if(index==size){
	    return add(value);
	}

	while (x<index-1){
	    current=current.nextNode();
	    x++;
	}
	LNode add = new LNode(value);
	add.setNext(current.nextNode());
	current.setNext(add);
	size++;
	return true;
    }
    
    public int indexOf(T val){
	int otpt = 0;
	LNode current = start;
	while (otpt<size){
	    if(current.get()==val){
		return otpt;
	    }
	    current = current.nextNode();
	    otpt++;
	}
	return -1;
    }

    public boolean add(T value){
	if(start == null){
	    start = new LNode(value);
	    end = start;
	    return true;
	}
	end.setNext(new LNode(value));
	end = end.nextNode();
	size++;
	return true;
    }

    public T remove(){
	if(size==1){
	    T ret = start.get();
	    start = null;
	    end = start;
	    return ret;
	}
	T ret = start.get();
	start = start.nextNode();
	size--;
	return ret;
    }
    
    public T remove(int index){
	if(index<0 || index>=size){
	    throw new IndexOutOfBoundsException("Index: "+index+"   Size: "+size());
	}
	if(index == 0){
	    return remove();
	}

	if (index==size-1){
	    T ret = end.get();
	    size--;
	    int x = 0;
	    end = start;
	    while(x<size-1){
		end=end.nextNode();
		x++;
	    }
	    end.setNext(end.nextNode().nextNode());
	    return ret;
	}

	LNode current = start;
	int x = 0;
	while(x<index-1){
	    current = current.nextNode();
	    x++;
	}
	T ret = current.nextNode().get();
	current.setNext(current.nextNode().nextNode());
	size--;

	return ret;
    }

    public String toString(){
	if (start == null){
	    return "["+start.get()+"]";
	}
	String otpt = "[";
	LNode current = start;
	if(start!=null){
	    otpt += current.get();
	}
	int x = 0;
	if (start.get()==null){
	    return "[]";
	}
	while(x<size-1){
	    otpt+=", ";
	    current = current.nextNode();
	    otpt+=current.get();
	    x++;
	}
	otpt+="]"+start.get()+" "+ end.get()+" "+size;
	return otpt;
    }
    
    public static void main(String[]args){
	MyLinkedList<Integer> n = new MyLinkedList<Integer>();
	for(int i = 0; i<10; i++){
	    n.add(i);
	}
	System.out.println(n);

	for(Integer x:n){
	    System.out.print(x+" ");
	}
	System.out.println();
	Iterator<Integer> it = n.iterator();
	Iterator<Integer> it2 = n.iterator();
	it.next();
	while(it.hasNext()){
	    System.out.println(it.next()+" vs "+it2.next());
	}

    }
}