	public static void insertSort(int[] array) {
		int P, i;
		for(P = 1; P<array.length; P++) {
			int temp = array[P];
			for(i = P; i >=1 && array[i-1] > temp; i--) {
				array [i] = array[i-1];
			}
			array[i] = temp;
		}
	}