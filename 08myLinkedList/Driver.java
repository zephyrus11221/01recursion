public class Driver{
    public static void main(String[]args){
	MyLinkedList b = new MyLinkedList();
	/*
	System.out.println(a);
	a.set(0, 1);
	System.out.println(a);
	a.set(2, 2);
	System.out.println(a);
	*/
	System.out.println(b);
	b.add(0);
	b.add(3);
	b.add(0);
	b.add(3);
	b.add(0);
	b.add(3);
	b.add(0);
	b.add(3);
	b.add(0);
	b.add(3);
	System.out.println(b);
	b.add(2, 4);
	System.out.println(b);
	b.remove(0);
	System.out.println(b);
    }
}