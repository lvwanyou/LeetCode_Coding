package coding_space;

// Beyond the time limit
/*int nums[] = {2,2,2,1,2,2,1,2,2,2};
int k = 2;

int odd_flags[] = new int[nums.length];
for(int i =0;  i< nums.length; i++){
    if(nums[i]%2 == 0) {
    	odd_flags[i] = 0;
    }else {
    	odd_flags[i] = 1;
    }
}
int array_count =0 ;
for(int i =0;  i< nums.length; i++){
	int odd_count =0 ;
	for( int j = i; j<nums.length; j++) {

		if(odd_flags[j]==1) {
			odd_count += 1;
		}
		
		if(odd_count == k) {
			array_count += 1;
		}else if(odd_count > k) {
			break;
		}
		
		
	}
}   
System.out.println(array_count);
return;
*/


// reference:
// https://leetcode-cn.com/problems/count-number-of-nice-subarrays/solution/hua-dong-chuang-kou-qian-zhui-he-bi-xu-miao-dong-b/
// 滑动窗口解法
public class Main {

	public static void main(String args[]) {
		int nums[] = {2,2,2,1,2,2,1,2,2,2,1};
		int k = 2;
		
		int left = 0, right = 0, odd_num =0, res= 0;
		
		while(right < nums.length) {
			
			int leftEvenNum = 0, rightEvenNum =0;

			if(nums[right++]%2 == 1) {
				odd_num ++;
			}
			
			if(odd_num == k) {
				while(nums[left]%2 == 0) {
					left++;
					leftEvenNum ++;
				}
				while(right < nums.length &&  nums[right]%2 == 0) {
					right++;
					rightEvenNum ++;
				}
				
				res += (leftEvenNum + 1) *(rightEvenNum + 1) ;
				left ++;
				odd_num--;
			}

 		}
		System.out.println(res);
		return;
	}
}
