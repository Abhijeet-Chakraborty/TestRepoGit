public class FibonacciSeries1{
	
	public static void printSeries(int times){
		System.out.print("0 ");
		int temp1 = 1, temp2=0;
		for(int i = 1;i < times; i++){
				int currVal = temp1+temp2;
				System.out.print(currVal+" ");
				temp1 = temp2;
				temp2 = currVal;
		}		
	}
	
	public static void main(String args[]){
		printSeries(3);
	}	
}