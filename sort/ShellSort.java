	/**
	 * @param array : Î´ÅÅĞòÊı×é
	 * @param D: Ï£¶ûÅÅĞò  ÔöÁ¿
	 */
	public static void shellSort(int[] array, int D) {		
		int P, i;
		for(; D>=1 ; D /=2) {
			for(P = D; P<array.length; P++) {
				int temp = array[P];
				for(i = P; i > D && array[i-D] > temp; i = i-D) {
					array [i] = array[i-D];
				}
				array[i] = temp;
			}
		}
	}