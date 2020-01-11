public class BinarySearchRecursion{

	public static int search(int[] arr, int f, int l,int search){
		if(f<=l){
			int mid = (f+l)/2;
			if(arr[mid] == search)
				return mid;
			
			if(arr[mid] > search)
				return search(arr, 0, mid - 1, search);
			else
				return search(arr, mid + 1, arr.length - 1, search);
		}
		
		return -1;
	}
	
	
	public static void main(String args[]){
		int arr[] = {-1, 3,67,89,90,555};
		int search = -1;
		int index = search(arr, 0, arr.length - 1, search);
		System.out.println(search +" val is present in index "+index);
	}
}