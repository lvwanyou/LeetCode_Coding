package coding_space;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MainClass {
	public static ArrayList<String> res = new ArrayList<>();
	public static void main(String[] args) {
		String str = "abc";
		Permutation(str.toCharArray(), 0);
		for(String item : res) {
			System.out.println(item);
		}
	}
	
	public static void Permutation(char[] arr, int i) {
		if(i == arr.length) {
			String tmp = String.valueOf(arr);
			if(!res.contains(tmp)) {
				res.add(tmp);
			}
			return;
		}
		for(int j = i; j< arr.length; j++) {
			swap(arr, i, j);
			Permutation(arr, i+1);
			swap(arr, i, j);
		}
	}
	public static void swap(char[] arr, int i, int j) {
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	
	public static void main111(String[] args) {		
		// 字符串的子序列
		String str = "abc";
		ArrayList<String> res = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		subSets(res, sb, str.toCharArray(), 0);
		for(String item : res) {
			 System.out.println(item);
		}
	}
	public static void subSets(ArrayList<String> res, StringBuffer sb, char[] chars, int i) {
		if( i == chars.length) {
			res.add(String.valueOf(sb.toString()));
			return;
		}
		sb.append(chars[i]);
		i++;
		subSets(res, sb, chars, i);
		i--;
		sb.deleteCharAt(sb.length()-1);
		
		subSets(res, sb, chars, i+1);
	}
	

	 public static int[] Dijkstra(int[][] weight, int start_v0) {
		int numsNode = weight.length;
		int[] distance = new int[numsNode];
		boolean[] visited = new boolean[numsNode];
		visited[start_v0] = true;
		for(int i =0 ; i<numsNode; i++ ) {
			distance[i] = weight[start_v0][i];
		}
		for(int i =0; i< numsNode; i++) {
			int index= -1;
			int dmin = Integer.MAX_VALUE;
			for(int j = 0; j <numsNode; j++) {
				if(visited[j] == false) {
					if(dmin > distance[j]) {
						dmin = distance[j];
						index = j;
					}
				}
			}
			if(index != -1) {
				visited[index] = true;
				for(int w =0; w< numsNode; w++) {
					if(visited[w] == false) {
						if(weight[index][w] != Integer.MAX_VALUE && (dmin + weight[index][w] < distance[w])) {
							distance[w] = dmin + weight[index][w];
						}
					}
				}
			}
		}
		return distance;
	}

	 public static void order(String s1){
	     	char[] chars = s1.toCharArray();
	     	ArrayList<Character> list = new ArrayList<>();
	        for(int i =0; i<chars.length ;i++){
	            list.add(chars[i]);
	        }
	        StringBuilder sb = new StringBuilder();
	      	for(int i = 0; i< list.size(); i++){
				order1(list, i, sb);
	        }
	      
	 }
	 public static void order1(ArrayList<Character> list, int i, StringBuilder sb ){
	     	if(i == list.size()-1){
	            System.out.println(sb.toString());
	            return;
	        }
	      	char tmp = list.get(i);
	      	sb.append(list.get(i));
	      	list.remove(i);
	      	for(int j = 0 ; j< list.size(); j ++){
	          order1(list, j, sb);
	        }
	      	list.add(tmp);
	        sb.deleteCharAt(sb.length()-1);
	    }
	 public static void main11(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//	        int n = sc.nextInt();
//	        int[] N = new int[n];
//	        for(int i = 0; i < n; i++){
//	           N[i] = sc.nextInt();1
//	        }  
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
	        	@Override 
	        	public int compare(Integer o1, Integer o2) {
	        		return o2.compareTo(o1);
	        	}
	        });
	        int[] nums = {1,23, 45,6};
	        for(int i =0; i< nums.length; i++) {
	        	maxHeap.offer(nums[i]);
	        }
	        HashMap<Character, Integer> map = new HashMap<>();
	        HashSet<Character> sets = new HashSet<>();
	        Date a = new Date();
	        System.out.println(a.getDay());
	        int x = 5, y =7, day = 30;
	        for(int i = 0; i <30 ; i++) {
	        	System.out.println("dayth : " + i + "   值班人员：" + order(x, y, i));
	        }
	    }
	public static int order(int x, int y, int day) {
		return (day/(y))%x;
	}
}

