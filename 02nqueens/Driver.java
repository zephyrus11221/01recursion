public class Driver{
    public static void main(String[]args){
	QueenBoard a = new QueenBoard(4);
	/*a.qAdd(0,0);
	System.out.println(a);
	a.qRem(0,0);
	System.out.println(a);
	*/
	/*
	System.out.println(a.solveH(0));
	System.out.println(a.solveH(1));
	System.out.println(a.solveH(2));
	System.out.println(a.solveH(3));
	System.out.println(a.solveH(4));
	*/
	System.out.println(a.solve());
//	System.out.println(a);
    }

}