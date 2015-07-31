package dp;

//Longest common subsequence
public class LongestCommonSubsequence {
	
	public static void main(String[] args){
		
		String s2 = "bdcaba";
		String s1 = "abcbdab";
		
		//Table for storing values
		int[][] table = new int[s1.length()+1][s2.length()+1];
		table = longestCommonSubseq(table, s1, s2);
		subseq(table, s1, s2);
		
	}
	
	public static int[][] longestCommonSubseq(int[][] table, String s1, String s2){
		
		for(int i=0; i<=s1.length(); i++){			
			for(int j=0; j<=s2.length(); j++){
				
				if(i == 0 || j == 0){
					table[i][j] = 0;
				}
				else if(s1.charAt(i-1) == s2.charAt(j-1)){
					table[i][j] = table[i-1][j-1] + 1;
				}
				else {
					table[i][j] = Math.max(table[i][j-1], table[i-1][j]);
				}
				
				
			}
			
		}
		
		for(int i=0; i<=s1.length(); i++){			
			for(int j=0; j<=s2.length(); j++){
				System.out.print(table[i][j]+" ");
			
			}
			System.out.println();
		}
		
		return table;
	
	}
	
	public static void subseq(int[][] table, String s1, String s2){
		int i = table.length-1;
		//System.out.println(i);
		int j = table[0].length-1;
		//System.out.println(j);
		
		String s = "";
		
		while(i > 0 && j > 0){
			 if (s1.charAt(i-1) == s2.charAt(j-1))
		      {
		          // Put current character in result
				 s = s2.charAt(j-1) + s;
		          i--; j--;   // reduce values of i, j and index
		      }
		 
		      // If not same, then find the larger of two and
		      // go in the direction of larger value
		      else if (table[i-1][j] > table[i][j-1])
		         i--;
		      else
		         j--;
		}
			
		System.out.println(s);
			
			
	}

}
