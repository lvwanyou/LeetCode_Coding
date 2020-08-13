package coding_space;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Date;
public class Zhanshang {
    public static void T3(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(func111(n, x));
        Date a = new Date();
        System.out.println(a.getDay());
	}
    public static int func111(int s ,int m){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((o1, o2)->o2-o1);
        int res= 1;
        int left = s/2;
        int right = s-left;
        int sum =0;
        sum += left* right;
       queue.add(left);
        queue.add(right);
        while(sum <m){
            int top = queue.poll();
            left = top/2;
            right = top- left;
           queue.add(left);
            queue.add(right);
            sum += left * right;
            res++;
        }
        return res;
    }
	
	
	
	
    static String alphbet ="abcdefghijklmnopqrstuvwxyz";
    public static void T2(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(func(n, x));
	}
    public static String func(int n ,int x){
        if(x >n  || x== 1&& n> 1){
            return "-1";
        }
        char[] res = new char[n];
        StringBuilder  sb = new StringBuilder();
        int[] firstTwo = {0, 1};
        int cnt =0;
        for(int i =0; i< n-(x-2); i++){
            sb.append(alphbet.charAt(firstTwo[cnt]));
            cnt = 1- cnt;
        }
        int index =2;
        for(int i= n-(x-2); i<n;i++){
             sb.append(alphbet.charAt(index++%x));
        }
        return sb.toString();
    }
    
    
	public static void T1Self(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        for(int i = 0; i < n; i++){
           N[i] = sc.nextInt();
        } 
        for(int i =0 ;i< N.length; i++){
        	String rev= new StringBuilder(IntegertoB(N[i])).reverse().toString();
        	int len =3 - rev.length()/4;
        	boolean flag= true;
        	int j =0;
        	for( ;j <rev.length() ; j++) {
        		if(rev.charAt(j) != '0') {
        			break;
        		}
        	}
        	rev = rev.substring(j, rev.length());
        	for(int k =0 ;k< len ;k++) {
        		rev += "0000";
        	}
            System.out.println(rev);
        }	        
    }
    public static String IntegertoB(int item){
        String tmp ="";
        while(item != 0){
            int pop = item %10;
            tmp = ItoB(pop) + tmp;
            item /= 10;
        }
        return tmp;
    }
    public static String ItoB(int i){
        if(i == 0) return "0000";
        if(i == 1) return "0001";
        if(i == 2) return "0010";
        if(i == 3) return "0011";
        if(i == 4) return "0100";
        if(i == 5) return "0101";
        if(i == 6) return "0110";
        if(i == 7) return "0111";
        if(i == 8) return "1000";
        if(i == 9) return "1001";
        return "";
    }

    
	
  	 public static void T1(String[] args) {
         HashMap<Integer,String> map =new HashMap<>();
         map.put(0, "0000");
         map.put(1, "0001");
         map.put(2, "0010");
         map.put(3, "0011");
         map.put(4, "0100");
         map.put(5, "0101");
         map.put(6, "0110");
         map.put(7, "0111");
         map.put(8, "1000");
         map.put(9, "1001");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         String ans;
         int x;
         for(int i =0; i< n; i++){
             x =sc.nextInt();
             ans = process(x,map);
	        	int j =0;
	        	for( ;j <ans.length() ; j++) {
	        		if(ans.charAt(j) != '0') {
	        			break;
	        		}
	        	}
	        	ans = ans.substring(j, ans.length());
             System.out.println(ans);
         }
	}
    public static String process(int x, HashMap<Integer, String> map){
        int[] nums = new int[3];
        int cnt =0;
        while(x>0){
            nums[cnt++]= x%10;
            x /=10;
        }
        StringBuilder sb = new StringBuilder();
        for(int i =2; i>=0; i--){
            sb.append(map.get(nums[i]));
        }
        String res= sb.reverse().toString();
        for(int i =0; i< res.length(); i++){
            if(res.charAt(i) == '1')
                break;
            if(res.charAt(i) == '0')
                res = res.substring(i+1);
                break;
        }
            return res;
    }

	
    
public static void PingduoduoT2(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] N = new int[n][6];
    int[] kind = new int[n];
    for(int i = 0; i < n; i++){
        for(int j =0 ; j< 6; j++){
            N[i][j] = sc.nextInt();
        }
    }
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    
    for(int i = 0; i< N.length; i++){
        boolean flag =false;
        int j =0;
        for(; j< i; j++){
            String[] NStr1 = new String[3];
            String[] NStr2 = new String[3];
            for(int k =0 ; k< N[i].length; k++){
            	if(NStr1[k/2] == null) {
            		NStr1[k/2] = String.valueOf(N[i][k]);
            	}else {
            		NStr1[k/2] += String.valueOf(N[i][k]);
            	}                    
            }
            for(int k =0 ; k< N[j].length; k++){
            	if(NStr2[k/2] == null) {
            		NStr2[k/2] = String.valueOf(N[j][k]);
            	}else {
            		NStr2[k/2] += String.valueOf(N[j][k]);
            	}
            }
            if(isSame(N[i], N[j])){
                kind[i] = kind[i] +1;
                flag= true;
                break;
            }
        }
        if(!flag){
            kind[j] = kind[j]+1;
        }
    }
    System.out.println("1");
}
public static boolean isSame(int[] a, int[] b){
     return false;
}
public static int distance = Integer.MAX_VALUE; 
 public static void chooseChars(char[] chars1, char[] chars2, int iIndex, int jIndex, int count) {
	 if(iIndex == chars1.length) {
		 count +=(chars2.length - jIndex);
		 distance = Math.min(count, distance);
		 return;
	 }
	 if(jIndex == chars2.length) {
		 count += (chars1.length - iIndex);
		 distance = Math.min(count, distance);
		 return;
	 }
	 if(chars1[iIndex] == chars2[jIndex]) {
		 iIndex++; jIndex++;
		 chooseChars(chars1, chars2, iIndex, jIndex, count);
	 }else {
		 //É¾³ýchars1 char ²Ù×÷
		 iIndex++;
		 count++;
		 chooseChars(chars1, chars2, iIndex, jIndex, count);
		 count--;
		 iIndex--;
		 
		 //É¾³ýchars2 char ²Ù×÷
		 jIndex++;
		 count++;
		 chooseChars(chars1, chars2, iIndex, jIndex, count);
		 count--;
		 jIndex--;
		 
		 // replace 
		 iIndex++;
		 jIndex++;
		 count++;
		 chooseChars(chars1, chars2, iIndex, jIndex, count);
		 count--;
		 jIndex--;
		 iIndex--;
	 }
 }
}
