package Practise_21_AUG;

public class NumberOfIslands {
	public static int noOfIslands(char [][] grid) {
		if(grid.length==0||grid==null) {
			return 0;
		}
		int islandsCount=0;
		for(int row=0;row<grid.length;row++) {
			for(int col=0;col<grid[row].length;col++) {
				if(grid[row][col]=='1') {
					islandsCount++;
					DFS(grid,row,col);
				}
			}
		} return islandsCount;
	}	
	public static void DFS(char [][] grid,int row,int col){
	// boundary limit
	  if(row<0||
		 row>=grid.length||
		 col<0||
		 col>=grid[row].length||
		 grid[row][col]=='0') {
		  return;
	  }
	  // setting to zero visited cell
	  grid[row][col]='0';
	  // up , down ,left ,right
	  DFS(grid,row-1,col);
	  DFS(grid,row+1,col);
	  DFS(grid,row,col-1);
	  DFS(grid,row,col+1);
	}	
	public static void main(String[] args) {
		char [][] grid1= 
		{
				{'1','0','1'},
				{'1','1','1'},
				{'1','0','1'}
		};
		System.out.println(noOfIslands(grid1));
	}
}
