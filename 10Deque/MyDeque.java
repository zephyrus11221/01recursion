public class MyDeque<T>{
    private T[] data;
    private int start, end;
    @SuppressWarnings("unchecked")	    
    public MyDeque(){
	//typecast object array to generic array
	data = (T[]) new Object[10];
    }
    
    public void addLast(T n){
	data[end]=n;
    }

    public T getStart(){
	return data[start];
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