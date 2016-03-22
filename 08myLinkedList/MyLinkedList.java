public class MyLinkedList <T>{
    private class LNode{
	private T value;
	private LNode next;

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
    private int size;
    private LNode end = start;

    public int size(){
	return size;
    }

    public T get(int index){
	int x = index;
	LNode current = start;
	while (x<size-1){
	    current = current.nextNode();
	}
	return current.get();
    }

    public T set(int index, T newValue){
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
	LNode current = start;
	int x = 0;
	if (index>=size||index<0){
	    return false;
	}
	while (x<index-1){
	    current=current.nextNode();
	    x++;
	}
	LNode add = new LNode(value);
	add.setNext(current.nextNode());
	current.setNext(add);
	size++;
	end=end.nextNode();
	return true;
    }
    
    public int find(T val){
	int otpt = 0;
	LNode current = start;
	while (!(current.get().equals(val))){
	    current = current.nextNode();
	    otpt++;
	}
	return otpt;
    }

    public boolean add(T value){
	if(start == null){
	    start = new LNode(value);
	    end = start;
	    return true;
	}
	/*
	LNode current = start;
	while (current.nextNode()!=null){
	    current = current.nextNode();
	}
	current.setNext(new LNode(value));
	size++;
	*/
	end.setNext(new LNode(value));
	end = end.nextNode();
	size++;
	return true;
    }

    public T remove(){
	T ret = start.get();
	start = start.nextNode();
	size--;
	return ret;
    }
    
    public T remove(int index){
	if(index == 0){
	    return remove();
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
	String otpt = "[";
	LNode current = start;
	if(start!=null){
	    otpt += current.get();
	}
	int x = 0;
	while(x<size){
	    otpt+=", ";
	    current = current.nextNode();
	    otpt+=current.get();
	    x++;
	}
	otpt+="]";
	return otpt;
    }
    
}