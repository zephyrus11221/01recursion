public class MyLinkedList{
    private class LNode{
	private int value;
	private LNode next;

	public LNode(int val){
	    value=val;
	    next = null;
	}

	public int get(){
	    return value;
	}

	public void set(int val){
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

    public int size(){
	return size;
    }

    public int get(int index){
	int x = index;
	LNode current = start;
	while (x<size-1){
	    current = current.nextNode();
	}
	return current.get();
    }

    public int set(int index, int newValue){
	LNode current = start;
	int x = 0;
	while (x<index){
	    current = current.nextNode();
	    x++;
	}
	int otpt = current.get();
	current.set(newValue);
	return otpt;
    }
    
    public boolean add(int index, int value){
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
	return true;
    }
    
    public boolean add(int value){
	if(start == null){
	    start = new LNode(value);
	    return true;
	}
	LNode current = start;
	while (current.nextNode()!=null){
	    current = current.nextNode();
	}
	current.setNext(new LNode(value));
	size++;
	return true;
    }

    public int remove(){
	int ret = start.get();
	start = start.nextNode();
	size--;
	return ret;
    }
    
    public int remove(int index){
	if(index == 0){
	    return remove();
	}
	LNode current = start;
	int x = 0;
	while(x<index-1){
	    current = current.nextNode();
	    x++;
	}
	int ret = current.nextNode().get();
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