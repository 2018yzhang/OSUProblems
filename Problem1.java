import java.util.*;


public class Problem1 {
	public static String merge(String s1, String s2) {
		
		StringBuilder result = new StringBuilder();
		
		int num1 = s1.length();
		int num2 = s2.length();
		int longer = 0;
		String longerS = "";
		String shorterS = "";
		if(num1>=num2) {
			longer = num1;
			longerS = s1;
			shorterS = s2;
		}
		else {
			longer = num2;
			longerS = s2;
			shorterS = s1;
		}
		for (int i = 0; i < longerS.length(); i++) { 
			  
            // First choose the ith character of the 
            // first string if it exists 
			result.append(longerS.charAt(i)); 
			if (i < shorterS.length()) {
				result.append(shorterS.charAt(i)); 
			}
		}
            
  
         // Then choose the ith character of the 
            // second string if it exists 
            
        return result.toString(); 
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	    System.out.println("First String: ");
	    String s1 = sc.nextLine();
	    System.out.println("Second String: ");
	    String s2 = sc.nextLine();
		
		System.out.println(merge(s1, s2));
		
    }
	
}
