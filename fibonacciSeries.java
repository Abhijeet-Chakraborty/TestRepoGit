class fibonacciSeries{
	private static int n1 = 0,n2 = 1,n3;
	public static void main(String[] args){//1 1 2 3 5
		System.out.print(n1+" "+n2);
		finbRec(10);		
	}
	
	public static void finbRec(int val){
		if(val > 2){			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			finbRec(--val);			
		}			
	}
}