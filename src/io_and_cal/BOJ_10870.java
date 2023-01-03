//피보나치수 5

package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num+1];
		arr[0] = 0;
		if(num > 0) arr[1] = 1;
		
		for(int i = 2; i <= num; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		System.out.println(arr[num]);
		
	}
}
