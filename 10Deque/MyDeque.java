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
    
    public void expand(){
	int ctr = 0;
	if (start<end){
	    ctr = end-start;
	}
    }
    public static void main(String[]args){
	MyDeque<String> x = new MyDeque<String>();
	x.addLast("fish");
	System.out.println(x.getStart());
    }
}