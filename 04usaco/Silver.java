import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Silver{
    private int[][] pasture;
    private int n, m, t, r1, c1, r2, c2;
    
    public String name(){
	return "Doan,Stephan";
    }

    public Silver(String file){
	try{
	    Scanner in = new Scanner(new File(file));
	    n = in.nextInt();
	    m = in.nextInt();
	    t = in.nextInt();
	    in.nextLine();
	    pasture = new int[n][m];
	    String line = "";
	    char[] lineHold;
	    for (int x = 0; x<n; x++){
		line = in.nextLine();
		lineHold= line.toCharArray();
		for (int y = 0; y<m; y++){
		    if (lineHold[y]=='.'){
			pasture[x][y]=0;
		    }else{
			pasture[x][y]=-1;
		    }
		}
	    }
	    r1 = in.nextInt();
	    c1 = in.nextInt();
	    r2 = in.nextInt();
	    c2 = in.nextInt();
	    in.close();
	}catch (FileNotFoundException e){
	    System.out.println("File not found. Try a different one.");
	}
    }
    
    public void disperse(int x, int y){
	if (pasture[x][y]!=-1){
	    if (x-1>-1 && pasture[x-1][y]!=-1){
		pasture[x-1][y]+=pasture[x][y];
	    }
	    if (y+1<m && pasture[x][y+1]!=-1){
		pasture[x][y+1]+=pasture[x][y];
	    }
	    if (y-1>-1 && pasture[x][y-1]!=-1){
		pasture[x][y-1]+=pasture[x][y];
	    }
	    if (x+1<n && pasture[x+1][y]!=-1){
		pasture[x+1][y]+=pasture[x][y];
	    }
	    pasture[x][y]=0;
	}
    }

    public String solve(){
	pasture[r1-1][c1-1]=1;
	for (int t1 = 0; t1<t; t1++){
	    for (int x = 0; x < n; x++){
		if (t1%2 == 0){
		    if((r1-1)%2 == 0 && (c1-1)%2==0){
			if (x%2 == 0){
			    for (int y = 0; y < m; y += 2){
				disperse(x,y);
			    }
			}else{
			    for (int y = 1; y < m; y += 2){
				disperse(x,y);
			    }
			}
		    }else{
			if (x%2 == 0){
			    for (int y = 1; y < m; y += 2){
				disperse(x,y);
			    }
			}else{
			    for (int y = 0; y < m; y += 2){
				disperse(x,y);
			    }
			}
		    }
		}else{
		    if((r1-1)%2 == 0 && (c1-1)%2==0){
			if (x%2 == 0){
			    for (int y = 1; y < m; y += 2){
				disperse(x,y);
			    }
			}else{
			    for (int y = 0; y < m; y += 2){
				disperse(x,y);
			    }
			}
		    }else{
			if (x%2 == 0){
			    for (int y = 0; y < m; y += 2){
				disperse(x,y);
			    }
			}else{
			    for (int y = 1; y < m; y += 2){
				disperse(x,y);
			    }
			}
		    }
		}
	    }
	}
	return ""+pasture[r2-1][c2-1]+",7,"+name();
    }
    
    public String toString(){
	String otpt = "";
	for (int x = 0; x<n; x++){
	    for (int y = 0; y<m; y++){
		if (pasture[x][y] == -1){
		    otpt += "  *";
		}else if(pasture[x][y]<10){
		    otpt += "  " + pasture[x][y];
		}else{
		otpt += " " + pasture[x][y];
		}
	    }
	    otpt+="\n";
	}
	//	otpt += r1 + " " + c1 + " " + r2 + " " + c2 + " "; 
	return otpt;
    }

    public static void main(String[]args){
	Silver a = new Silver("ctravel.in");
	System.out.println(a.solve());	
    }
}