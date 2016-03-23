public class Driver2{
    public static void main(String[]args) {
	MyLinkedList<Integer> m = new MyLinkedList<Integer>();
	System.out.println("~~~~~~~~~~~~~~~Creating list~~~~~~~~~~~~~~~\n");
	for (int i = 0; i < 20; i++) {
	    m.add(i);
	    System.out.println(i+" List: "+m.toString());
	}
	
	System.out.println("\n\n~~~~~~~~~~~Getting values~~~~~~~~~~~~~~\n");
	for (int i = 0; i < m.size(); i++) {
	    System.out.println(m.get(i));
	}
	System.out.println("\n\n~~~~~~~~~~~Setting values~~~~~~~~~~~~~~\n");
	for (int i = 0; i < m.size(); i++) {
	    m.set(m.size()-i-1, i);
	    System.out.println(m.toString());
	}
	System.out.println("\n\n~~~~~~~~~~~Adding values at index~~~~~~\n");

	System.out.println(m.toString());
	m.add(0, 10);
	System.out.println(m.toString());
	
	m.add(0, 30);
	System.out.println(m.toString());
	m.add(2, 40);
	System.out.println(m.toString());
	m.add(6, 50);
	System.out.println(m.toString());


	System.out.println("\n\n~~~~~~~~~~~Getting Index of values~~~~\n");

	System.out.println(m.toString());
	for (int i = 0; i < m.size(); i++) {
	    System.out.println("The index of "+i+": "+m.find(i));
	}
	
	System.out.println("\n\nSize: "+m.size());
	System.out.println("\n~~~~~~~~~~~Removing values~~~~~~~~~~~~\n");
	for (int i = 0; i < m.size();) {
	    m.remove(m.size()-1);
	    System.out.println(m.toString());
	}
    }
}