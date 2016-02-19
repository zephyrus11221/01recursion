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
    
    public String name(){
	return "Doan,Stephan";
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

    private void colClear(int col){
	int x = 0;
	while (!qRem(x, col)&&x<size-1){
	    x++;
	}
    }

    public boolean solve(){
	return solveH(0);
    }

    public boolean solveH(int col){
	boolean added = false;
	for (int x = 0; x<size; x++){
	    if(qAdd(x, col)){
		added=true;
		if (col<size-1){
		    if (solveH(col+1)){
			return true;
		    }else{
			added=false;
			colClear(col+1);
			colClear(col);
		    }
		}
	    }
	    if (col==size-1){
		for(int y = 0; y<size; y++){
		    if (board[y][col]==0){
			qAdd(y, col);
			return true;
		    }else if(y==size-1){
			return false;
		    }
		}
	    }
	}
	return added;
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
    public String printSolution(){
	String otpt = "";
	for (int x = 0; x<size; x++){
	    for (int y = 0; y<size; y++){
		if(board[x][y]<1){
		    otpt += "_ ";
		}
		else{
		    otpt += "Q ";
		}
	    }
	    otpt+="\n";
	}
	return otpt;
    }
}