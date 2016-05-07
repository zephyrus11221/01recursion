import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>{
    private int size;
    private T[] data;
    
    public MyHeap(){}
    
    public MyHeap(T[] array){
	int size = array.length;
	data = (T[]) new Comparable[size+1];
	for (int x = 1; x<data.length; x++){
	    data[x]=array[x-1];
	}
    }
    
    private void pushDown(int k){
	T temp = data[k];
	if (data[k*2].compareTo(data[k*2+1])>0){
	    data[k]=data[k*2];
	    data[k*2]=temp;
  	}else{
	    data[k]=data[k*2+1];
	    data[k*2+1]=temp;	
	}    
    }
    
    private void pushUp(int k){
	T temp = data[k];
	data[k]=data[k/2];
	data[k/2]=temp;
    }
		
    private void heapify(){
	for (int x = size; x>1; x++){
	    if(data[x].compareTo(data[x/2])>0){
		pushUp(x);
	    }
	}
    }
    /*
    public T delete(){
	T otpt;
	return otpt;
    }
	*/
    private void doubleSize(){
	T[] temp = (T[]) new Comparable[size*2+1];
	for (int x = 1; x<size+1;x++){
	    temp[x]=data[x];
	}
	data = temp;
    }

    public void add(T x){
	if(size==data.length){
	    doubleSize();
	}
	int index = size;
	data[size]=x;
	while(data[index].compareTo(data[index/2])>0){
	    pushUp(index);
	    index/=2;
	}
    }
	
    public String toString(){
	return data.toString();
    }
	
	//do this last
    public MyHeap(boolean isMax){
    }
    public MyHeap(T[] array, boolean isMax){
    }
	
}