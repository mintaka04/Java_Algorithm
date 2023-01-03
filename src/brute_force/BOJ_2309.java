//일곱 난쟁이
//7명의 키를 더하면 100.
//9명 중 7명에 포함되는 난쟁이의 키를 오름차순으로 출력.

package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2309 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//난쟁이의 키를 배열에 저장
		//포함되지 않는 두 난쟁이의 키의 합 = sum
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int sum = -100;
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		int notIn1 = 10;
		int notIn2 = 10;
		
		for(int i = 0; i < 9; i++) {
			int tmp = sum-arr[i];
			
			for(int j = 0; j < 9; j++) {
				if(i==j) continue;
				if(tmp == arr[j]) {
					notIn1 = i;
					notIn2 = j;
					break;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 9; i++) {
			if(i != notIn1 && i != notIn2) sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}

/*
 * 내 풀이의 경우
 * 키 입력하면서 전체 합 구함 -> 정렬(9개밖에 안되니까 sort 사용) ->
 * 전부 돌면서 전체 합 -100이 되는 두 수의 배열 인덱스를 각각 저장 ->
 * 배열 출력시 해당 인덱스 아닌 조건 걸 것
 * 
 * 인데,
 * 
 * 다른 분 풀이를 보니
 * 전부 돌면서 전체합 -100이 되는 부분을 찾는데에서 이미 돌았던 부분은 다시 돌지 않도록
 * 1) j가 i이상일 것 이라는 조건이랑
 * 2) boolean값을 하나 줘서, 원하는 두 수를 찾았을 경우 boolean값 변경,
 * 		i에 대한 for문시 해당 boolean값 체크를 해줘서 한 번 찾으면 바로 빠져나갈 수 있도록 조건을 주었음.
 * 그리고 원하는 두 값을 -1로 한 뒤에 sort를 적용해줘서
 * 배열 출력시 인덱스 2부터 출력해줘서 조건 체크를 하나 빼줄 수 있었음!
 */