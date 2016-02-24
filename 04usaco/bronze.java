public class Bronze{
    private int[][] lake;
    private int r, c, e, n;
    
    public Bronze (){
	lake = new int[][] { { 28 25 20 32 34 36 } { 27 25 20 20 30 34 } { 24 20 20 20 20 30 } {20 20 14 14 20 20} };
	r = 4;
	c = 6;
	e = 22;
	n = 2;
    }

    public Bronze (String file){
	Scanner in = new Scanner(file);
    }

    public void dig (int x, int y, int d){
	int _max = lake[x][y];
	for (int _x = 0; _x<3; _x++){
	    for (int _y = 0; _y<3; _y++){
		_max = Math.max(_max, lake[x+_x][y+_y]);
	    }
	}
	int _d = _max-d;
	for (int _x = 0; _x<3; _x++){
	    for (int _y = 0; _y<3; _y++){
		if (lake[x+_x][y+_y]>_d){
		    lake[x+_x][y+_y]=_d;
		}
	    }
	}
    }
    
    public String toString(){
	String otpt = "";
	for (int x = 0; x < r; x++){
	    for (int y = 0; y < c; y++){
		if (lake[x][y]>9){
		    otpt += " ";
		    otpt += lake[x][y];
		}else if(lake[x][y]>0){
		    otpt += "  ";
		    otpt += lake[x][y];
		}else{
		    otpt += " --";
		}
	    }
	    otpt += "\n";
	}
	return otpt;
    }
}