import java.util.Map;

public class 3Duplicate{
	
//	�Լ��Ľⷨ	
	/*
	 * ����Ƿȱ�㣺
	 * 
	 * û�ж���Ч�����������ж� û�ж�ʱ�临�ӶȺͿռ临�Ӷ�������
	 */
	public static int findDuplicate(int[] intArray) {
		if(intArray == null || intArray.length == 0) {
			return -1;
		}
		Map<Integer, Integer> map = new Hashmap<>(intArray.length);
		for(int num: intArray) {
			if(map.get(i) == null) {
				map.put(num, 1);
			}else {
				return num;
			}
		}
		return -1;
	}
	
//	��ȷ����
	public static int findDuplicate1(int[] intArray) {
		if(intArray == null || intArray.length == 0) {
			return -1;
		}
		// �жϲ��Ϸ�����
		for(int num : intArray) {
			if(num < 1  || num > intArray.length) {
				return -1;
			}
		}
		
		int start = 1;
		int end = intArray.length - 1;
		
		while(end >= start) {
			int middle = (start + end) / 2;
			int count = countRange(intArray, start, middle);
			  // ��ֹ����
            if (start == end) {
                if (count > 1) {                    
                    return middle;
                } else {
                    break;
                }
            }
            if (count > (middle - start) + 1) {
                end = middle;
            } else {
                start = middle + 1;
            }

		}

        return -1;
	}
	
	public static int countRange(int[] intArray, int start, int end) {
		if(intArray.length == 0) {
			return 0;
		}
		int count = 0;
		for(int num : intArray) {
			if(num >= start && num <= end) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] intArray = {2, 3, 5, 4, 3, 2, 6, 7};
		System.out.println( findDuplicate1(intArray));
	}
}
