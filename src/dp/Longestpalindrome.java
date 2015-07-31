package dp;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Longestpalindrome {
	
	public static void main(String[] args){
		
		Stack n = new Stack();
		LinkedList<String> l = new LinkedList<String>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		Queue<String> s2 = new LinkedList<String>();
		
		String s = "aabba";
		boolean[][] table = new boolean[s.length()][s.length()];
		palindrome(s, table);
		
	}
	
	public static void palindrome(String s, boolean[][] table){
		
		int start=-1, maxLen = 0;
		
		//Length 1 palindrome
		for(int i=0; i<s.length(); i++){
			table[i][i] = true;
		}
		
		//Length 2 palindrome
		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i) == s.charAt(i+1)){
				table[i][i+1] = true;
				start = i;
	            maxLen = 2;
	            
			}			
		}
		
		//Length 3 palindrome and above
		for(int k=3; k<=s.length(); k++){
			for(int m=0; m<s.length()-k+1; m++){
				
				int j = m+k-1;
				
				if(table[m+1][j-1] && s.charAt(m) == s.charAt(j)){
					table[m][j] = true;	
					
					if(k > maxLen){
						maxLen = k;
						start = m;
						//System.out.println(maxLen);
					}
				}
				
				
			}
		}
		
		System.out.println(maxLen);
		System.out.println(start);
		s = s.substring(start,maxLen+1);
		System.out.println(s);		
		
	}

}
