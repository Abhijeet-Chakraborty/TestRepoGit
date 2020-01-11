public class StringPalindromeRecursion{
	public static StringBuilder val = new StringBuilder();
	public static boolean checkPalindrome(String str, int i){
		if(i >= 0){			
			val.append(str.charAt(i));	
			//System.out.println(val + "-"+ str);				
			if(str.equals(val.toString()))
				return true;
			else		
				return checkPalindrome(str, --i);	
			
			//		
		}
		return false;
	}
	
	public static void main(String args[]){
		String str = "dalda";
		System.out.print(checkPalindrome(str, str.length() - 1));
	}
}