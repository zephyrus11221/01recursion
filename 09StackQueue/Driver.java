public class Driver{
    public static void main(String[]args){
	MyLinkedList<String> a = new MyLinkedList<String>();
	a.add("first");
	System.out.println(a);
	a.add("hello");
	a.add("ydodis");
	System.out.println(a);
	a.add(0,"Stahp");
	a.add(1,"Ples");
	System.out.println(a);
	System.out.println(a.get(0));
	System.out.println(a.get(3));
	a.remove(0);
	System.out.println(a);
	System.out.println(a.get(2));
    }
}