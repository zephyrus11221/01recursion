public class Driver{
    public static void main(String[]args){
        Maze f;
        f = new Maze("data3.dat",true);//true animates the maze.
        
        f.clearTerminal();
        f.solve();

        f.clearTerminal();
        System.out.println(f);
    }
}