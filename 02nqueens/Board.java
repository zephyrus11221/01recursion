public class Board{
    public int[][]board;
    private int size;
    public Board(int s){
	size = s;
	board=new int[s][s];
	for (int x = 0; x<size; x++){
	    for (int y = 0; y<size; y++){
		board[x][y]=0;
	    }
	}
    }

    public int size(){
	return size;
    }

    private void qRem(int x, int y){
	board[x][y]=0;
    }

    private boolean qAdd(int x, int y){
	if (board[x][y]<0){
	    return false;
	}
	board[x][y]=1;
	return true;
    }
}