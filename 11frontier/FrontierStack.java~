import java.util.*;
public class FrontierStack<T> implements Frontier<T>{
    public Stack<T> data;
    public void add(T element){
	data.push(element);
    }
    
    public T next(){
	return data.pop();
    }
    
    public boolean hasNext(){
	return !data.empty();
    }

}