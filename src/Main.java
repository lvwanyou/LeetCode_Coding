
public class Main{
	public static int main(String args[]) {
		System.out.println("11111111111111");
		return 0;
	}
//	public static void dfs(char[][] grid, int r, int c) {
//		int grid_r = grid.length;
//		int grid_c = grid[0].length;
//		
//		if(r<0 || c<0 || r >= grid_r || c>= grid_c || grid[r][c] == '0') {
//			return;
//		}
//		
//		grid[r][c] = '0';   
//		
//		dfs(grid, r-1, c);
//		dfs(grid, r, c-1);
//		dfs(grid, r+1, c);
//		dfs(grid, r, c+1);
//		
//	}
//	
//	public static int main(String args[]) {
//		char grid[][] ={{'1','1','1','1','0'},
//				{'1','1','0','1','0'},
//				{'1','1','0','0','0'},
//				{'0','0','0','0','0'}};
//		
//		if(grid.length==0) {
//			return 0;
//		}
//		
//		int num_island =0;
//		int grid_r = grid.length;
//		int grid_c = grid[0].length;
//		
//		for(int i=0; i< grid_r; i++) {
//			for(int j=0; j < grid_c; j++) {
//				if(grid[i][j] == '1') {
//					num_island += 1;
//					dfs(grid, i ,j);
//				}
//			}
//		}
//		
//		System.out.println(num_island);
//		
//		return num_island;
//	}

}