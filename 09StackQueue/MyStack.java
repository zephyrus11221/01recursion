import java.util.*;

public class MyStack<T>{
    private MyLinkedList<T> data;
    
    public MyStack(){
	data = new MyLinkedList<T>();
    }

    public void push(T item){
	data.add(0, item);
    }
    
    public T pop(){
	return data.remove(0);
    }
    
    public T peek(){
	return data.get(0);
    }
    
    public int size(){
	return data.size();
    }

    public boolean isEmpty(){
	return data.size()==0;
    }
    
    public static void main(String[]args){
	MyStack<String> a = new MyStack<String>();
	
	a.push("Greetings childs");
	System.out.println(a.peek());
	System.out.println(a.pop());
	a.push("Why do you remove me");
	a.push("Where do you think I go");
	System.out.println(a.peek());
	a.pop();
	System.out.println(a.peek());
	a.pop();
	System.out.println("AAAAAAAAAAAAAAAAAAAGHAGHGHGHGHGHGHHGHGHGHGGHGHGGGHHGGHGHHHGGHGHGHHGGGHHGH");
	
	Random rand = new Random(0);
	for(int i = 0; i < 6000; i++){
	    int op = rand.nextInt(4);
	    if(op == 0 || a.isEmpty()){
		a.push(""+i);
	    }else{
		a.pop();
	    }
	}
    }
}