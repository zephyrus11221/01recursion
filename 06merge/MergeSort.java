public class MergeSort{
    public static int[] merge(int[] a, int[] b){
	int[] otpt = new int[a.length+b.length];
	int[] small, large;
	if (a.length<b.length){
	    small = a;
	    large = b;
	}else{
	    small = b;
	    large = a;
	}
	int y = 0;
	int x = 0;
	for (; x<small.length;){
	    if (small[x]<large[y]){
		otpt[x+y]=small[x];
		x++;
	    }else{
		otpt[x+y]=large[y];
		y++;
	    }
	}
	for (; y<large.length; y++){
	    otpt[x+y]=large[y];
	}
	return otpt;
    }

    public static int[] shorter(int[] a, int[] b){
	if (a.length<b.length){
	    return a;
	}
	return b;
    }
    
    public static int[] longer(int[] a, int[] b){
	if (shorter(a, b).equals(a)){
	    return b;
	}
	return a;
    }

    public static void main(String[]args){
	int[] a = new int[] {1, 5, 8, 10};
	int[] b = new int[] {3, 4, 6, 9, 11};
	int[] c = merge(a,b);
	String otpt = "";
	for (int x = 0; x<c.length; x++){
	    otpt += c[x];
	}
	System.out.println(otpt);
    }

}