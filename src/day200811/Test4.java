package day200811;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Arrays;

public class Test4 {
	public static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	public static void main(String[] args) {
		// 无序数组；
		int[] arr = {7, 8 ,1 , 3, 6};
		createHeap(arr);
		for(int i =0; i < arr.length;i++) {
			int tmp = minHeap.poll();
			if( i == (arr.length/2)){
				System.out.println(tmp);
				break;
			}
		}
		return;
	}
	public static void createHeap(int[] arr) {
		for(int i =0; i< arr.length;i++) {
			minHeap.offer(arr[i]);
		}
	}
}

















class CI{
	// 无返回值的泛型方法
	public <T> void test(T t) {
		T t1 = t;
	}
	//有返回值的泛型方法
	public <T> T test1(T t) {
		return t;
	}
	public <T>  void test2(T...ts) {
		
	}
}


class AT<T>{
	private T key ;
	public void setKey(T key ) {
		this.key = key;
	}
	public T getKey() {
		return this.key;
	}
}

class BC<T> implements IB<T>{

	@Override
	public T test(T t) {
		// TODO Auto-generated method stub
		return t;
	}
	
}
interface IB<T>{
	public T test(T t);
}

