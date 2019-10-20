class BinarySearch{
	public static void main(String [] args){
		int arr[] = {2,10,56,76,88};
		int value = 10;
		searchValue(arr, value);
	}
	
	public static void searchValue(int arr[], int value){
		int firstIndex = 0, lastIndex = arr.length - 1, mid = 0;
		while(firstIndex <= lastIndex){			
			mid = (firstIndex + lastIndex)/2;
			if(arr[mid] > value){
				lastIndex = mid - 1;
			}else if(arr[mid] == value){
				System.out.println(mid+" index");
				break;
			}else{
				firstIndex = mid + 1;
			}			
		}		
	}
}