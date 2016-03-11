import java.util.Random;
import java.util.Arrays;
public class Quick{
    
    public static String name(){
	return "7,Doan,Stephan";
    }

    public static int partitionOld(int[] data, int left, int right){
	Random RNG = new Random();
	int spot = RNG.nextInt(right-left)+left;
	System.out.println(""+ left+ " " + right);
	int value = data[spot];
	data[spot]=data[right];
	data[right]=value;
	int x = left;
	int y = right-1;
	int hold = 0;
	while(x!=y){
	    if(data[x]>value){
		swap(data, x, y);
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

    public static int quickselectOld(int[]data, int k){
	return quickselectOld(data, k, 0, data.length-1);
    }

    public static void quickSortOld(int[]data){
	quickSortOld(data, 0, data.length-1);
    }

    public static void quickSortOld(int[]data, int left, int right){
	if (right-left>=1){
	    int index = partitionOld(data,left,right);
	    quickSortOld(data,left,index-1);
	    quickSortOld(data,index+1,right);
	}
    }
	
    public static int quickselectOld(int[]data, int k, int left, int right){
	if (right==left){
	    return data[left];
	}
	int index = partitionOld(data, left, right);
	if (k<index){
	    return quickselectOld(data, k, left, index-1);
	}
	if (k>index){
	    return quickselectOld(data, k, index+1, right);
	}
	return data[k];
	  
    }

    //--------------------------------------------------------------------------------

    public static void swap(int[]data, int x, int y){
	int hold = data[x];
	data[x]=data[y];
	data[y]=hold;
    }

    public static int[] partition(int[] data, int left, int right){
	int[] otpt = new int[2];
	Random RNG = new Random();
	int spot = RNG.nextInt(right-left)+left;
	int value = data[spot];
	data[spot]=data[right];
	data[right]=value;
	int x = left;
	int y = right-1;
	while(x!=y){
	    if(data[x]>value){
		swap(data, x, y);
		y--;
	    }else{
		x++;
	    }
	}
	int z = left;/*
	if(data[x]<value){
	    x--;
	    }*/
	while(z<x){
	    if(data[z]==value){
		swap(data, z, x);
		x--;
	    }
	    z++;
	}
	if(data[y]>value){
	    data[right]=data[y];
	    data[y]=value;
	    otpt= new int[]{x, y};
	    //	    System.out.println(Arrays.toString(data)+ x + y);
	    return otpt;
	}else{
	    data[right]=data[y+1];
	    data[y+1]=value;
	    otpt= new int[]{x, y+1};
	    //	    System.out.println(Arrays.toString(data)+ x + (y+1));
	    return otpt;
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
	    int[] indices = partition(data,left,right);	    
	    quickSort(data,left,indices[0]);
	    quickSort(data,indices[1]+1,right);
	}
    }
	
    public static int quickselect(int[]data, int k, int left, int right){
	if (right==left){
	    return data[left];
	}
	int[] indices = partition(data, left, right);
	if (k<indices[1]-1){
	    return quickselect(data, k, left, indices[0]);
	}
	if (k>indices[1]-1){
	    return quickselect(data, k, indices[1]+1, right);
	}
	return data[k];
	  
    }

    public static void main(String[]args){
	int[] a = new int[]{9, 39, 10, -3, 13, 56, 98, 70};
	int[] b = new int[]{3, 5, 89, 76, 20, -18, 4, 205};
	int[] c = new int[]{89, 12, 90, 0, 12, -90, 15, 12, 34};
	int[] d = new int [4000000];
	int[] e = new int [4000000];
	Random RNG = new Random();
	int val = 0;
	for (int x = 0; x < 4000000; x++){
	    val = RNG.nextInt(4);
	    d[x] = val;
	}
	for (int x = 0; x < 4000000; x++){
	    val = RNG.nextInt(Integer.MAX_VALUE);
	    if (RNG.nextInt(2)==1){
		e[x] = val;
	    }else{
		e[x] = -1*val;
	    }
	}

	
	System.out.println(partitionOld(a, 0, 7));
	System.out.println(Arrays.toString(a));
	System.out.println("----------------------------------------");
	quickSortOld(b);
	System.out.println(b);
	System.out.println("----------------------------------------");
	quickSort(c);
	System.out.println(Arrays.toString(c));
	//---------------------------------------------------------
	
	long start = System.currentTimeMillis();
        if(args[0].equals("A")){
            Arrays.sort(d);
        }
        if(args[0].equals("Q")){
            quickSort(d);
        }
        if(args[0].equals("O")){
            quickSortOld(d);
        }
        long end = System.currentTimeMillis();

        System.out.println("Time:"+ (end-start)/1000.0 + " seconds. Size = "+d.length);

	start = System.currentTimeMillis();
	
        if(args[0].equals("A")){
            Arrays.sort(e);
        }
        if(args[0].equals("Q")){
            quickSort(e);
        }
        if(args[0].equals("O")){
            quickSortOld(e);
        }
        end = System.currentTimeMillis();

        System.out.println("Time:"+ (end-start)/1000.0 + " seconds. Size = "+e.length);

    }
}
