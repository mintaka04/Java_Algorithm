package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] arr = new boolean[42];
		for(int i = 1; i <= 10; i++) {
			arr[Integer.parseInt(br.readLine())%42] = true;
		}
		
		int result = 0;
		for(int i = 0; i <= 41; i++) {
			if(arr[i]) result++;
		}
		
		System.out.println(result);
		br.close();
	}
}

/*
 * 중복이 불가능하므로 HashSet을 쓰는 것도 가능.
 * 
 * HashSet 객체 선언하고 나머지를 전부 hashset에 저장하면 알아서 중복된 값은 제거됨.
 * 그리고 HashSet의 size를 출력해주면 간단하게 끝난다.
 * 코드는 다음과 같음.
 * 
 * HashSet<Integer> r = new HashSet<>();
 * for(int i = 0; i < 10; i++){
 * 		int num = Integer.valueOf(br.readLine());
 * 		r.add(input%42);
 * }
 * 
 * System.out.println(s.size());
 */