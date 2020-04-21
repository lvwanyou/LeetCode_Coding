import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode-cn.com/problems/count-the-repetitions/solution/shuang-bai-jie-fa-qiu-zan-qiu-guan-zhu-by-banfeipe/

/*466. 统计重复个数

由 n 个连接的字符串 s 组成字符串 S，记作 S = [s,n]。例如，["abc",3]=“abcabcabc”。

如果我们可以从 s2 中删除某些字符使其变为 s1，则称字符串 s1 可以从字符串 s2 获得。例如，根据定义，"abc" 可以从 “abdbec” 获得，但不能从 “acbbe” 获得。

现在给你两个非空字符串 s1 和 s2（每个最多 100 个字符长）和两个整数 0 ≤ n1 ≤ 106 和 1 ≤ n2 ≤ 106。现在考虑字符串 S1 和 S2，其中 S1=[s1,n1] 、S2=[s2,n2] 。

请你找出一个可以满足使[S2,M] 从 S1 获得的最大整数 M 。

 

示例：

输入：
s1 ="acb",n1 = 4
s2 ="ab",n2 = 2

返回：
2

输入:
"aaa"  aaa aaa aaa
3
"aa" aa
1

返回：
4
*/



/**********************************  time out  **********************************/ 
/*public class Main {
	public static void main(String args[] ) {
//		String s1 ="aaa";
//		int n1 = 3;
//		String s2 ="aa";
//		int n2 = 1;
		String s1 ="acb";
		int n1 = 4;
		String s2 ="ab";
		int n2 = 2;
        String s1_rep = new String();
        for(int i = 0; i < n1 ; i++){
            s1_rep += s1;
        }

        String s2_rep = new String();
        for(int i = 0; i < n2 ; i++){
            s2_rep += s2;
        }
        
        int count = 0;
        int s1_index = 0;
        int j;
        while(s1_index < s1_rep.length()){
            // if(){
            //     break;
            // }
            for(j =0; j < s2_rep.length() && s1_index < s1_rep.length(); j++){
                for(int i = s1_index; i < s1_rep.length(); i++){
                    s1_index++;
                    if(s2_rep.charAt(j) == s1_rep.charAt(i)){
                        break;
                    }else{
                        continue;
                    }
                }
            }
            if(j >= s2_rep.length())    {
                count++;
            }
        }

        System.out.print(count);
	}
}*/


public class main111{
	public static int main111(String args[]) {
		String s1 ="abaacdbac";
		int n1 = 100;
		String s2 ="adcbd";
		int n2 = 4;
		if(n1 == 0 ) {
			return 0;
		}
		int s1_cnt = 0, index = 0, s2_cnt = 0; // s1_cnt,s2_cnt: s1,s2 current number
		Map<Integer, int[]> recall = new HashMap<>();
		while(s1_cnt < n1) {

			for(int i= 0 ; i < s1.length();i++) {
				if(s1.charAt(i) == s2.charAt(index)) {
					index += 1;
				}
				if(index == s2.length()) { 
					s2_cnt += 1;
					index = 0;
				}
			}
			
			s1_cnt += 1;
			
			if(recall.containsKey(index)) {
				int[] last = recall.get(index);
				int cycle1 =  s1_cnt -last[0];
				int cycle2 =  s2_cnt -last[1];
				
                
	             // (n1-couts1)/circle1 表示从发现第一个循环节开始(不包括第一个循环节)后所有的循环节的个数；
	             // 因为每个循环节 中包含circle2 个 s2 , 因此外面 multiply circle2
	             // 在加上之前的couts2
				s2_cnt += cycle2*((n1-s1_cnt)/cycle1);
				
	             // 循环节个数原理同上
	             // 因为每个循环节 中包含circle1 个 s1 , 因此外面 multiply circle1
	             // 在加上之前的couts1
				s1_cnt = s1_cnt+((n1-s1_cnt)/cycle1)*cycle1;//更新新他们

			}else{
				recall.put(index, new int[] {s1_cnt, s2_cnt});
			}
		}
		return s2_cnt/n2;
	}
}