public class IntegerPalindrome{

	
	public static boolean isPalindrome(int original){
		
		int reverse = 0;
		int palindrome = original;
		while(palindrome != 0)		{
			int reminder = palindrome%10;			
			reverse = reverse * 10 + reminder;
			if(reverse == original)
				return true;
			palindrome = palindrome/10;				
		}

			return false;
	}
	
	public static void main(String args[]){
		int original = 1003;
		System.out.println(isPalindrome(original));
	}
}