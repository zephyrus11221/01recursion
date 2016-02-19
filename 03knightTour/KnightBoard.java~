public class KnightBoard{
    public int[][] board;
    public int size, steps = 0;
    public int[]k = {0, 0};


    public KnightBoard (int s){
	board = new int[s+4][s+4];
	size = s;
	int offset=0;
	for (int x = 0; x<size+4; x++){
	    board[offset][0]=-1;
	    board[0][offset]=-1;
	    board[offset][1]=-1;
	    board[1][offset]=-1;
	    board[size+3][offset]=-1;
	    board[offset][size+3]=-1;
	    board[size+2][offset]=-1;
	    board[offset][size+2]=-1;
	    offset++;
	}
    }
    public boolean move(int x, int y, int step){
	if (steps<size*size){
	    System.out.println(toString()+"\n"+steps);
	    if (board[x+2][y+1]==0&&step<1){
		k[0]=x+2;
		k[1]=y+1;
		steps++;
		board[x+2][y+1]=steps;
		if (!move(k[0], k[1], 0)){
		    k[0]=x;
		    k[1]=y;
		    steps--;
		    board[x+2][y+1]=0;
		    move(k[0], k[1], 1);
		}
	    }else if (board[x-2][y+1]==0&&step<2){
		k[0]=x-2;
		k[1]=y+1;
		steps++;
		board[x-2][y+1]=steps;
		if (!move(k[0], k[1], 0)){
		    k[0]=x;
		    k[1]=y;
		    steps--;
		    board[x-2][y+1]=0;
		    move(k[0], k[1], 2);
		}
	    }else if (board[x+2][y-1]==0&&step<3){
		k[0]=x+2;
		k[1]=y-1;
		steps++;
		board[x+2][y-1]=steps;
		if (!move(k[0], k[1], 0)){
		    k[0]=x;
		    k[1]=y;
		    steps--;
		    board[x+2][y-1]=0;
		    move(k[0], k[1], 3);
		}
	    }else if (board[x-2][y-1]==0&&step<4){
		k[0]=x-2;
		k[1]=y-1;
		steps++;
		board[x-2][y-1]=steps;
		if (!move(k[0], k[1], 0)){
		    k[0]=x;
		    k[1]=y;
		    steps--;
		    board[x-2][y-1]=0;
		    move(k[0], k[1], 4);
		}
	    }else if (board[x+1][y+2]==0&&step<5){
		k[0]=x+1;
		k[1]=y+2;
		steps++;
		board[x+1][y+2]=steps;
		if (!move(k[0], k[1], 0)){
		    k[0]=x;
		    k[1]=y;
		    steps--;
		    board[x+1][y+2]=0;
		    move(k[0], k[1], 5);
		}
	    }else if (board[x-1][y+2]==0&&step<6){
		k[0]=x-1;
		k[1]=y+2;
		steps++;
		board[x-1][y+2]=steps;
		if (!move(k[0], k[1], 0)){
		    k[0]=x;
		    k[1]=y;
		    steps--;
		    board[x-1][y+2]=0;
		    move(k[0], k[1], 6);
		}
	    }else if (board[x+1][y-2]==0&&step<7){
		k[0]=x+1;
		k[1]=y-2;
		steps++;
		board[x+1][y-2]=steps;
		if (!move(k[0], k[1], 0)){
		    k[0]=x;
		    k[1]=y;
		    steps--;
		    board[x+1][y-2]=0;
		    move(k[0], k[1], 7);
		}
	    }else if (board[x-1][y-2]==0&&step<8){
		k[0]=x-1;
		k[1]=y-2;
		steps++;
		board[x-1][y-2]=steps;
		if (!move(k[0], k[1], 0)){
		    k[0]=x;
		    k[1]=y;
		    steps--;
		    board[x-1][y-2]=0;
		    move(k[0], k[1], 8);
		}
	    }
	}
	if (steps==size*size&&board[2][2]==1){
	    return true;
	}
	return false;
    }

    public boolean solve(){
	board[2][2]=-1;
	return move(2,2,0);
    }

    public String toString(){
	String otpt = "";
	for (int x = 0; x<size+4; x++){
	    for (int y = 0; y<size+4; y++){
		if (board[x][y]>9||board[x][y]<0){
		    otpt+= " ";
		}else{
		    otpt+= "  ";
		}
		otpt += board[x][y];
	    }
	    otpt+="\n";
	}
	return otpt;
    }
    public String printSolution(){
	solve();
	board[2][2] = 0;
	String otpt = "";
	for (int x = 0; x<size+4; x++){
	    for (int y = 0; y<size+4; y++){
		if (board[x][y]>9||board[x][y]<0){
		    otpt+= " ";
		}else{
		    otpt+= "  ";
		}
		otpt += board[x][y];
	    }
	}
	return otpt;
    }
}