package coding_space;

public class Main {

	public static void main(String args[]) {
		Solution a = new Solution();
		char grid[][] = { {'1', '1', '1', '1', '1'  }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };
		
		int abc = 1000;
		
		char grid_array[] = { '1', '1', '1', '1', '1' };

		aaaa ac = new aaaa();
		ac.edit(grid);
		ac.edit_int(abc);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(abc);
		
		for (int j = 0; j < 5; j++) {
			System.out.print(grid_array[j]);
		}
		return;
	}

}

class aaaa {
	void edit(char[][] test) {
		test[0][0] = '0';
		test[0][1]= '0';
	}
	
	void edit_int(int t) {
		t =0;
	}
	
	
	void edit_array(char[] t) {
		t[0] = '0';
	}
}