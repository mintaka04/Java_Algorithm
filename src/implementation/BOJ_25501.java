package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25501 {
	
	static int recursionNum;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int NUM = Integer.parseInt(br.readLine());
		
		while(NUM-->0) {
			char[] a = br.readLine().toCharArray();
			recursionNum = 0;
			sb.append(isPalindrome(a) + " " + recursionNum + "\n");
		}
		
		System.out.println(sb);
		br.close();
		
	}
	
	static int isPalindrome(char[] a) {
		return recursion(a, 0, a.length - 1);
	}
	
	static int recursion(char[] a, int l, int r) {
		recursionNum++;
		if(l >= r) return 1;
		else if(a[l] != a[r]) return 0;
		else return recursion(a, l+1, r-1);
	}
}
