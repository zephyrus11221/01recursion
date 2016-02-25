public class Recursion{
    public String name(){
	return "Doan,Stephan";
    }
    private double sqrt(double n, double _guess){
	double guess=_guess;
	if (_guess==(n/_guess+_guess)/2){
	    return guess;
	}else{
	    guess=sqrt(n, (n/guess+guess)/2);
	}
	return guess;
    }
    public double sqrt(double n){
	double guess=n/4;
	if (n==1 || n==0){
	    return n;
	}
	if (n<0){
	    throw new IllegalArgumentException("Square root of negative is imaginary. Use a positive number.");
	}
	return sqrt(n, guess);
    }
}