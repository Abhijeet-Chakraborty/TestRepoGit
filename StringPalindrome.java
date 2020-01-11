public class StringPalindrome{
	
	public static boolean checkPalindrome(String str){
		StringBuilder val = new StringBuilder();
		for(int i=str.length()-1; i>=0; --i){
			val.append(str.charAt(i));
		}
		
		System.out.println(val);
		
		return str.equals(val);
	}
	
	public static void main(String args[]){
		System.out.print(checkPalindrome("madad"));
	}

}