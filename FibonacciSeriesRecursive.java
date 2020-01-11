public class FibonacciSeriesRecursive{
	public static int temp1 = 1, temp2=0;
	public static void printSeries(int times){	
				if(times>1){
					int currVal = temp1+temp2;
					System.out.print(currVal+" ");
					temp1 = temp2;
					temp2 = currVal;	
					printSeries(--times);
				}
	}
	
	public static void main(String args[]){
		System.out.print("0 ");
		printSeries(10);
	}	
}