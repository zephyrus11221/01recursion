public class Driver{
    public static void main(String[]args){
	KnightBoard a = new KnightBoard(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	//	System.out.println(a.solve());
	System.out.println(a);
	System.out.println(a.printSolution());
    }

}