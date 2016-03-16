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
	    System.out.println(val);
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
    
    public MyLinkedList(){
	start = new LNode(0);
	size = 1;
    }

    public MyLinkedList(int length){
	start = new LNode(0);
	size = length;
	int x = 0;
	LNode current = start;
	while (x<length-1){
	    current.setNext(new LNode(0));
	    current = current.nextNode();
	    x++;
	}
    }

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
	    System.out.println(this);
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
	while (x<index){
	    current=current.nextNode();
	}
	LNode hold = current;
	current.set(value);
	current.setNext(hold);
	return true;
    }
    
    public boolean add(int value){
	LNode current = start;
	int x = 0;
	while (x<size-1){
	    current = current.nextNode();
	}
	current.setNext(new LNode(value));
	return true;
    }

    public String toString(){
	String otpt = "[";
	LNode current = start;
	otpt += current.get();
	for (int x = 0; x<size-1; x++){
	    otpt+=", ";
	    current = current.nextNode();
	    otpt+=current.get();
	}
	otpt+="]";
	return otpt;
    }
    
}