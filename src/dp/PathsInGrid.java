package dp;

public class PathsInGrid {
	
	public static void main(String[] args) {

		int grid[][]={{1,1,1},{1,1,1},{1,1,1}};
		int paths=numOfPaths(grid, 3, 3);
		System.out.println(paths);
}
	public static int numOfPaths(int grid[][],int m, int n){
		// Create a 2D table to store results of subproblems
	    int[][] count= new int[m][n];
	 
	    // Count of paths to reach any cell in first column is 1
	    for (int i= 0; i < m; i++){
	    	if(grid[i][0]==1){
	    		count[i][0] = 1;
	    	}else{
	    		break;
	    	}
	    }

	    // Count of paths to reach any cell in first column is 1
	    for (int j = 0; j < n; j++){
	    	if(grid[0][j]==1){
	   	    	count[0][j] = 1;
			}else{
	    		break;
	    	}
	    	long x= (long) Math.pow(2,3);
	    }
	    
    		
	 
	    // Calculate count of paths for other cells in bottom-up manner using
	    // the recursive solution
	    for (int i = 1; i < m; i++){
	        for (int j = 1; j < n; j++){
	        	if(grid[i][j]==0){
	        		count[i][j]=0;	        		
	        	}else{
	        		 count[i][j] = (int) ((int)(count[i-1][j] + count[i][j-1])%(Math.pow(10,9)+7));
	        	}
	        } 
	    }
	    return count[m-1][n-1];
	
}}