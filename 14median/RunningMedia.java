public class RunningMedian{
    MyHeap<Integer> low;
    MyHeap<Integer> high;
    
    public RunningMedian(){
	low = new MyHeap<Integer>();
	high = new MyHeap<Integer>(false);
    }
    
    public void add(int val){
	if(low.size()<=high.size()){
	    low.add(val);
	}
    }
}