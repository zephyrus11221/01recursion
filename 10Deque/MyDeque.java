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
	//	end++;
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
	else if (start-1==end){
	    expand();
	}else{
	    start--;
	}
	data[start]=n;
    }
    
    public T remStart(){
	T ret;
	if(start!=end){
	    if(start==data.length-1){
		ret = data[start];
		data[start]=null;
		start=0;
		return ret;
	    }else{
		ret = data[start];
		data[start]=null;
		start++;
		return ret;
	    }
	}
	ret = data[start];
	data[start]=null;
	return ret;
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
	T[] copy = (T[]) new Object[data.length*2];
	int x = 0;
	while (x<ctr+1){
	    copy[x]=data[start];
	    x++;
	    if(start==data.length-1){
		start = 0;
	    }else{
		start++;
	    }
	}
	end = x-1;
	start = 0;
	data=copy;
    }
    
    public String toString(){
	String otpt = "[";
	int x = start;
	if (start==end){
	    otpt+=(String)data[start];
	}
	else if(start<end){
	    while (x<=end){
		otpt+=data[x];
		x++;
		if(start!=end){
		    otpt+=", ";
		}
	    }
	}
	//	else if(start==end+1){
	else{
	    otpt+=data[x];
	    while(x!=end){
		x++;
		if(x==data.length){
		    x=0;
		}
		otpt+=", ";
		otpt+=data[x];
		if (x==data.length){
		    x=0;
		}
	    }
	}
	otpt+="]";
	return otpt+data.length+" "+start+" "+end;

    }
    
    public static void main(String[]args){
	MyDeque<String> x = new MyDeque<String>();
	x.addLast("fish");
	System.out.println(x.getStart());
	System.out.println(x);
	System.out.println(x);
	x.addStart("hiya");
	System.out.println(x);
	System.out.println(x.remStart());
	x.addStart("hiya");
	System.out.println(x);
	x.addStart("hiya");
	System.out.println(x);
	x.addStart("hiya");
	System.out.println(x);
	x.addStart("hiya");
	System.out.println(x);
	x.addStart("hiya");
	System.out.println(x);
	x.addStart("hiya");
	System.out.println(x);
	x.addStart("hiya");
	System.out.println(x);
	x.addStart("hiya");
	System.out.println(x);
	x.addStart("hiya");
	System.out.println(x);
	x.addStart("hiya");
	System.out.println(x);
    }
}