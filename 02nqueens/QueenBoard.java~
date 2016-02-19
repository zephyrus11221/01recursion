public class QueenBoard{
    private int[][]board;
    private int size, row;
    public QueenBoard(int s){
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

    public boolean qCheck(int x, int y){
	return board[x][y]==1;
    }

    public boolean qRem(int x, int y){
	if (board[x][y]!=1){
	    return false;
	}
	board[x][y]=0;
	int offset=1;
	while(y+offset < board[x].length){
	    board[x][y+offset]++;
	    if(x - offset >= 0){
		board[x-offset][y+offset]++;
	    }
	    if(x + offset < board.length){
		board[x+offset][y+offset]++;
	    }
	    offset++;
	}
	return true;
    }

    public boolean solve(){
	boolean otpt;
	int col=0;
	for (int x = 0; x<size; x++){
	    if (solveH(col)){
		col++;
		//System.out.println(col);
	    }else{
		qRem(row,col);
		board[row][col]=-1;
	        col--;
		//System.out.println(col);
	    }
	    //	    System.out.println(toString());
	}
	for (int y = 0; y<size; y++){
	    if (qCheck(col,y)){
		return true;
	    }
	}
	return false;
    }

    public boolean solveH(int col){
	int _row=0;
	while (!qAdd(_row, col)&&_row<size-1){
	    _row++;
	    System.out.println(_row);
	}
	System.out.println(_row+""+col);
	System.out.println(toString());
	if (qCheck(_row, col)){
	    System.out.println(toString());
	    qAdd(_row, col);
	    row=_row;
	    return true;
	}
	System.out.println(toString());
	qRem(col, _row);
	return false;
    }

    public boolean qAdd(int x, int y){
	if (board[x][y]!=0&&board[x][y]!=2){
	    return false;
	}
	board[x][y]=1;
	int offset=1;
	while(y+offset < board[x].length){
	    board[x][y+offset]--;
	    if(x - offset >= 0){
		board[x-offset][y+offset]--;
	    }
	    if(x + offset < board.length){
		board[x+offset][y+offset]--;
	    }
	    offset++;
	}
	return true;
    }

    public String toString(){
	String otpt = "";
	for (int x = 0; x<size; x++){
	    for (int y = 0; y<size; y++){
		if(board[x][y]<0){
		    otpt += " ";
		}
		else{
		    otpt += "  ";
		}
		otpt+=board[x][y];
	    }
	    otpt+="\n";
	}
	return otpt;
    }
}