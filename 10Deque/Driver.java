public class Driver{
    public static void main(String[]args){
	MyDeque<String> a = new MyDeque<String>();
	System.out.println(a);
	
	a.addLast(""+1);
	System.out.println(a);
	for (int x = 0; x<25; x++){
	    a.addLast(""+x);
	    System.out.println(a);
	}
    }
}