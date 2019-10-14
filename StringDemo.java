import java.util.*;
class StringDemo{

	public static void main(String[] args){
		int[] intArray = {1,66,2,5,77};
		String str = Arrays.toString(intArray);
		System.out.println("String"+str);// int array to String
		
		System.out.println("Length of String"+str.length());// Length of String
		
		String str1 = "Hi Folks! How are You!!";
		System.out.println("String to char array"+Arrays.toString(str1.toCharArray()));// String to char array
		
		char[] chArray = str1.toCharArray();
		int count = 0;
		for(char ch : chArray){
			if(ch == '!')
				count++;
		}
		System.out.println("Character count is "+count);// Count character occurence
		
		
	}
}