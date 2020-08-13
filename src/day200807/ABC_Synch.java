package day200807;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_Synch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = sc.nextInt();
        int[][] N = new int[T][n];
        for(int i = 0; i < T; i++){
             for(int j = 0; j<n ; j++){
                  N[i][j] = sc.nextInt();
             }
        }

        for(int i=0 ;i<T ;i++){
            Arrays.sort(N[i]);
                  int ans = 0;
            if(N[i].length <= 1){
                if(N[i].length == 1){
                    ans = N[i][0];
                }else{
                    ans =0;
                }
            }else{
                int sum = 0;
                int[] dp = new int[  100000];
                boolean[][] state = new boolean[1000][1000];
                for(int j =0; j < N[i].length; j++){
                    sum+= N[i][j];
                }
                for(int j =0; j < N[i].length; j++){
                    for(int k = sum/2; k >= N[i][j]; --k){
                        if(dp[k] < dp[k - N[i][j]] + N[i][j]){
                        	dp[k] = dp[k - N[i][j]] + N[i][j];
                            state[j][k] = true;
                        }
                    }
                    
                }
                int min = sum - dp[sum/2]*2;
                boolean flag = false;
                for(int a =0; a < N[i].length; a++){
                    for(int b = 0; b < N[i].length; b++) {
                    	if(N[i][b] - N[i][a] == min) {
                    		flag = true;
                    		System.out.println(N[i][b] + N[i][a] );
                    		break;
                    	}
                    }
                    if(flag) break;
                }
                if(!flag) {
                	int tmp =0;
                	for(int a =0; a < N[i].length; a++){
                		tmp += N[i][a];
                	}
                	System.out.println(tmp );
                }
            }
        }
    }
	
	
    public static void mai111n(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        for(int i = 0; i < n; i++){
                N[i] = sc.nextInt();
        }
        int ans =0;
        Arrays.sort(N);
        int tmp =  N[0]/2;
        ans = tmp;
        for(int i=1 ;i<n ;i++){
        	tmp = tmp + (N[i]-N[i-1])/2;
            ans += tmp;
        }
        System.out.println(ans);
    }
    
    public static void main111(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        for(int i = 0; i < n; i++){
                N[i] = sc.nextInt();
        }
        int ans =0;
        for(int i=0 ;i<n ;i++){
            ans += countOdd(N[i]);
        }
        System.out.println(ans);
    }
    public static int countOdd(int num){
    	int count =0;
        if(num == 0) return 0;
        if(num == 1) return 0;
        if(num % 2 == 0){
            count = countOdd(num-2) +1;
        }else {
            count = countOdd(num-3) +1;
        }
        return count;
    }
}

