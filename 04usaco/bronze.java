import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Bronze{
    private int[][] lake;
    public int[] cmd;
    private int r, c, e, n;
    
    public String name(){
	return "Doan,Stephan";
    }

    public Bronze (){
	lake = new int[][] { { 28, 25, 20, 32, 34, 36 }, { 27, 25, 20, 20, 30, 34 }, { 24, 20, 20, 20, 20, 30 }, {20, 20, 14, 14, 20, 20} };
	r = 4;
	c = 6;
	e = 22;
	n = 2;
    }

    public Bronze (String file){
	try{
	Scanner in = new Scanner(new File(file));
	r = in.nextInt();
	c = in.nextInt();
	e = in.nextInt();
	n = in.nextInt();
	lake = new int[r][c];
	for (int x = 0; x<r; x++){
	    for (int y = 0; y<c; y++){
		lake[x][y]=in.nextInt();
	    }
	}
	cmd = new int[3*n];
	for (int x = 0; x<n ; x++){
	    cmd[x*3] = in.nextInt();
	    cmd[x*3+1] = in.nextInt();
	    cmd[x*3+2] = in.nextInt();
	}
	in.close();
	}catch (FileNotFoundException e){
	    System.out.println("File not found. Try a different one.");
	}
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
    
    public String solve(){
	int sum = 0;
	String otpt = "";
	for (int x = 0; x<n; x++){
	    dig(cmd[x*3]-1, cmd[x*3+1]-1, cmd[x*3+2]);
	}
	for (int x = 0; x<r; x++){
	    for (int y = 0; y<c; y++){
		if (e>lake[x][y]){
		    sum+=e-lake[x][y];
		}
	    }
	}
	otpt+= sum*5184;
	otpt+= ",7,"+name();
	return otpt;

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
    public static void main(String[]args){
	Bronze a = new Bronze("makelake.in");
	System.out.println(a.solve());
    }
}