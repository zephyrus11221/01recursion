import java.util.*;
public class MyDeque<T>{
    private T[] data;
    private int start, end;
    @SuppressWarnings("unchecked")	    
    public MyDeque(){
	//typecast object array to generic array
	data = (T[]) new Object[10];
    }
    
    public boolean isEmpty(){
	return data[start]==null;
    }
    
    public int size(){
	if (start<end){
	    return end-start+1;
	}else{
	    return data.length-start+end;
	}
    }
    
    public void addLast(T n){
	if (isEmpty()){
	    System.out.println("hello");
	    data[start]=n;
	}
	else{ 
	    if (end==data.length-1){
		if (start>0){
		    end = 0;
		}else{
		    expand();
		}
	    }
	    else if (start-1==end){
		expand();
	    }else{
		end++;
	    }
	    data[end]=n;
	}
    }

    public void addFirst(T n){
	if (isEmpty()){
	    System.out.println("hello");
	    data[start]=n;
	}
	else{ 
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
    }
    
    public T removeFirst(){
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

    public T removeLast(){
	T ret;
	if(start!=end){
	    if(end==0){
		ret = data[end];
		data[end]=null;
		end=data.length-1;
		return ret;
	    }else{
		ret = data[end];
		data[end]=null;
		end--;
		return ret;
	    }
	}
	ret = data[end];
	data[end]=null;
	return ret;
    }

    
    public T getFirst(){
	return data[start];
    }
    
    public T getLast(){
	return data[end];
    }
    @SuppressWarnings("unchecked")    
    public void expand(){
	int ctr = size();
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

      



        MyDeque<Integer> d = new MyDeque<Integer>();


        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();





       // Limit the number of times addFirst and addLast is done


 


        int limit = 1000000;


 


        if (args.length > 0) {


            limit = Integer.parseInt(args[0]);


        }


 


        // Add to the head and to the tail


 


        for (int i = 0; i < limit/2; i++) {


            Integer r1 = (int) (Math.random() * 1000000);


 


            // Add first


            d.addFirst(r1);


            ad.addFirst(r1);


        }


        


        for (int i = 0; i < limit/2; i++) {


            Integer r2 = (int) (Math.random() * 1000000);


            // Add last


            d.addLast(r2);


            ad.addLast(r2);


        }


 


        // Test if adding worked by removing elements


 


        for (int i = 0; i < limit; i++) {


            if (!d.getFirst().equals(ad.getFirst())) {


                System.out.println("Test #0 (addFirst) failed at: " + i + "!");


                System.exit(0);


            }


 


            if (!d.getLast().equals(ad.getLast())) {


                System.out.println("Test #1 (addLast) failed at: " + i + "!");


                System.exit(0);


            }


 


            if (!d.removeFirst().equals(ad.removeFirst())) {


                System.out.println("Test #2 (removeFirst) failed at: " + i + "!");


                System.exit(0);


            }


 


            if (!d.removeLast().equals(ad.removeLast())) {


                System.out.println("Test #3 (removeLast) failed at: " + i + "!");


                System.exit(0);


            }


        }





        // Sizes should be equal
 


        if (d.size() != ad.size()) {


            System.out.println("Not equal sizes. Error!");


            System.exit(0);


        }





        System.out.println("Success!");


    }
    
}