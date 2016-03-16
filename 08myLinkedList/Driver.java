public class Driver{
    public static void main(String[]args){
	MyLinkedList a = new MyLinkedList(5);
	System.out.println(a);
	a.set(0, 1);
	System.out.println(a);
	a.set(2, 2);
	System.out.println(a);
    }
}