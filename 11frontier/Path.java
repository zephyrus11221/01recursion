import java.util.*;

public class Path{
    public int[] data;
    public int size;
    public Path(int length){
	data = new int[length];
    }
    
    public void add(int x, int y){
	data[size]=x;
	data[size+1]=y;
	size+=2;
    }
    
    public void rem(){
	size-=2;
    }
    
    public String toString(){
	String otpt = data.toString();
	otpt = otpt.substring(0,size);
	return otpt;
    }
}