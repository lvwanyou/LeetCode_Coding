	/**
	 * 有序子序列的归并
	 * @param array : 其中包含两个有序子序列
	 */
	public static void merge(int[] array, int[] tempArray, int L, int R, int rightEnd) {
		int leftEnd = R-1 ;
		int tmp = L;
		int NumberElements = rightEnd - L + 1;
		while(L<= leftEnd && R<= rightEnd) {
			if(array[L]< array[R]) tempArray[tmp++] = array[L++];
			else tempArray[tmp++] = array[R++];
		}
		while(L<= leftEnd) {
			tempArray[tmp++] = array[L++]
		}
		while(R<= rightEnd) {
			tempArray[tmp++] = array[R++];
		}
	}
	
	/**
	 * 归并排序 
	 * @param array : 其中包含两个有序子序列
	 */
	
	public static void MSort(int[] array, int[] tempArray, int L,  int rightEnd) {		
		if(L < rightEnd) {
			int mid = (L + rightEnd)/2;
			MSort(array, tempArray, L, mid);
			MSort(array, tempArray, mid+1, rightEnd);
			merge(array, tempArray, L, mid+1, rightEnd);
		}
	}
	
	public static void Merge_Sort(int[] array) {
		int[] tempArray = new int[array.length];
	}
	