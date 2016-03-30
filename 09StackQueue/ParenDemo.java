public class ParenDemo{
    
    public static boolean isMatching(String s){
	String hold,val;
	MyStack<String> paren = new MyStack<String>();
	for (int x = 0; x<s.length(); x++){
	    hold = s.substring(x,x+1);
	    if(hold.equals("(")||
	       hold.equals("[")||
	       hold.equals("{")||
	       hold.equals("<")){
		paren.push(hold);
	    }
	    else if(hold.equals(")")||
		    hold.equals("]")||
		    hold.equals("}")||
		    hold.equals(">")){
		if(paren.isEmpty()){
		    System.out.println("hello");
		    return false;
		}
		
		val = paren.peek();
		System.out.println(val+hold);
		if (hold.equals(")")){
		    if(!val.equals("(")){
			return false;
		    }
		}
		if (hold.equals("}")){
		    if(!val.equals("{")){
			return false;
		    }
		}
		if (hold.equals("]")){
		    if(!val.equals("[")){
			return false;
		    }
		}
		if (hold.equals(">")){
		    if(!val.equals("<")){
			return false;
		    }
		}
		paren.pop();
	    }
	}
	return paren.isEmpty();
    }
    public static void main(String[]args){
	String input = "()()(([[]]))";
	if(args.length > 0){
	    input = args[0];
	    System.out.println( isMatching(input)); 
	}else{
	    System.out.println("Usage:"); 
	    System.out.println("java ParenDemo \"text\""); 
	}
    }
}