import java.util.*;
public class FrontierQueue<T> implements Frontier<T>{
    public Queue<T> data;

    public void add(T element){
        data.add(element);
    }
    
    public T next(){
	return data.poll();
    }
    
    public boolean hasNext(){
	return data.peek()!=null;
    }

}