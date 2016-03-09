import java.util.Random;
import java.util.Arrays;
public class Quick{
    
    public static String name(){
	return "7,Doan,Stephan";
    }

    public static int partition(int[] data, int left, int right){
	Random RNG = new Random();
	int spot = RNG.nextInt(right-left)+left;
	int value = data[spot];
	data[spot]=data[right];
	data[right]=value;
	int x = left;
	int y = right-1;
	int hold = 0;
	while(x!=y){
	    if(data[x]>value){
		hold = data[x];
		data[x] = data[y];
		data[y] = hold;
		y--;
	    }else{
		x++;
	    }
	}
	if(data[y]>value){
	    data[right]=data[y];
	    data[y]=value;
	    return y;
	}else{
	    data[right]=data[y+1];
	    data[y+1]=value;
	    return y+1;
	}
    }

    public static int quickselect(int[]data, int k){
	return quickselect(data, k, 0, data.length-1);
    }

    public static void quickSort(int[]data){
	quickSort(data, 0, data.length-1);
    }

    public static void quickSort(int[]data, int left, int right){
	if (right-left>=1){
	    int index = partition(data,left,right);
	    System.out.println(Arrays.toString(data)+data[index]);
	    quickSort(data,left,index-1);
	    quickSort(data,index+1,right);
	}
    }
	
    public static int quickselect(int[]data, int k, int left, int right){
	if (right==left){
	    return data[left];
	}
	int index = partition(data, left, right);
	if (k<index){
	    return quickselect(data, k, left, index-1);
	}
	if (k>index){
	    return quickselect(data, k, index+1, right);
	}
	return data[k];
	  
    }

    public static void main(String[]args){
	int[] a = new int[]{9, 39, 10, -3, 13, 56, 98, 70};
	int[] b = new int[]{3, 5, 89, 76, 20, -18, 4, 205};
	int[] c = new int[]{89, 90, 12, 26, 1, -90, 15, 1789, 34};
	System.out.println(partition(a, 0, 7));
	System.out.println(Arrays.toString(a));
	System.out.println("----------------------------------------");
	System.out.println(quickselect(b, 2));
	System.out.println("----------------------------------------");
	quickSort(c);
	System.out.println(Arrays.toString(c));


    }
}