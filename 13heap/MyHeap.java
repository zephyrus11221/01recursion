import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>{
    private int size;
    private T[] data;
    
    public MyHeap(){
	data = (T[]) new Comparable[2];
	size = 0;
    }
    
    public MyHeap(T[] array){
	size = array.length;
	System.out.println(size);
	data = (T[]) new Comparable[size+1];
	for (int x = 1; x<array.length+1; x++){
	    System.out.println(array[x-1]);
	    data[x]=array[x-1];
	    System.out.println(data[x]);
	}
	System.out.println(this);
	heapify();
    }
    
    private void pushDown(int k){
	T temp = data[k];
	if(k*2+1>size){}
	else if (data[k*2].compareTo(data[k*2+1])>0){
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
	boolean wrong = true;
	while(wrong){
	    wrong = false;
	    for (int x = size/2; x>0; x--){
		//		try{
		System.out.println(x);
		System.out.println("hello");
		if (x*2+1>size){}
		else  if(data[x].compareTo(data[x*2])<0 || data[x].compareTo(data[x*2+1])<0){
			wrong = true;
			pushDown(x);
			//		    }
		}//catch(IndexOutOfBoundsException e){}
	    }
	}
    }

    public T delete(){
	T otpt = data[1];
	

	return otpt;
    }

    private void doubleSize(){
	T[] temp = (T[]) new Comparable[size*2+1];
	for (int x = 1; x<size+1;x++){
	    temp[x]=data[x];
	}
	data = temp;
    }

    public void add(T x){
	if(size==data.length-1){
	    doubleSize();
	}
	size++;
	int index = size;
	data[size]=x;
	if (!(size==1)){
	    while(index>1 && data[index].compareTo(data[index/2])>0){
		System.out.println(index);
		System.out.println(data[index]);
		pushUp(index);
		index/=2;
	    }
	}
    }
	
    public String toString(){
	String otpt = "["+data[1];
	System.out.println(size);
	for (int x = 2; x<size+1; x++){
	    System.out.println(x);
	    otpt+=" " + data[x].toString();
	}
	otpt += "]";
	return otpt;
    }
	
	//do this last
    public MyHeap(boolean isMax){
    }
    public MyHeap(T[] array, boolean isMax){
    }
	
}