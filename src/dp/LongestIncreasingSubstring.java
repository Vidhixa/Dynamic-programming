package dp;

public class LongestIncreasingSubstring{
	
	public static void main(String args[]){
		
		int[] x = { 8, 7, 1};		
		int[] table = new int[x.length];
		lis(x, table);
		
		
	}
	
	public static void lis(int[] x, int[] table){
		
		table[0] = 1;
		int max = Integer.MIN_VALUE;
		int index = -1;
		
		for(int i=1; i<x.length; i++){
			
			if(x[i-1] < x[i] ){
				table[i] = table[i-1] + 1;
			} else {
				table[i] = 1;
			}
			
			if(table[i] > max){
				max = table[i];
				index = i;
				//System.out.println(max+" "+index);				
			}
		
		}
		System.out.println(max+" "+index);
		
		//Displaying max substring 
		for(int i=index-max+1; i<max ; i++){
			//System.out.print(x[i]+" ");			
		}
		
	}

}
