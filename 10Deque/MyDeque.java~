public class MyDeque<T>{
    private T[] data;
    private int start, end;
    @SuppressWarnings("unchecked")	    
    public MyDeque(){
	//typecast object array to generic array
	data = (T[]) new Object[10];
    }
    
    public void addLast(T n){
	if (end+1==data.length){
	    if (start==0){
		expand();
	    }else{
		end = 0;
	    }
	}
	if (end+1==start){
	    expand();
	}
	data[end]=n;
    }

    public void addStart(T n){
	if (start==0){
	    if (end<data.length-1){
		start = data.length-1;
	    }else{
		expand();
	    }
	}
	if (start-1==end){
	    expand();
	}
	data[start]=n;
    }
    
    public T getStart(){
	return data[start];
    }
    
    public T getLast(){
	return data[end];
    }
    @SuppressWarnings("unchecked")    
    public void expand(){
	int ctr = 0;
	if (start<end){
	    ctr = end-start+1;
	}else if(start==end){
	    ctr = 1;
	}else{
	    ctr = data.length-start+end;
	}
	T[] copy = (T[]) new Object[10];
	int x = 0;
	while (x<ctr){
	    copy[x]=data[start];
	    x++;
	    if(start==data.length-1){
		start = 0;
	    }else{
		start++;
	    }
	}
	end = x;
	start = 0;
    }
    
    public static void main(String[]args){
	MyDeque<String> x = new MyDeque<String>();
	x.addLast("fish");
	System.out.println(x.getStart());
    }
}