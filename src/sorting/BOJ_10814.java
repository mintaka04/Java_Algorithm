package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10814 {
	
	static int N;
	static int[][] age;		//이름 정렬위한 인덱스 위해 2차원 배열 사용
	static String[] name;
	static int[][] sorted;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		
		age = new int[N][2];
		sorted = new int[N][2];
		name = new String[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			age[i][0] = i;
			age[i][1] = Integer.parseInt(st.nextToken());
			name[i] = st.nextToken();
		}
		
		mergeSort(age, 0, N-1);
		
		for(int i = 0; i < N; i++) {
			sb.append(age[i][1] + " " + name[age[i][0]] + "\n");
		}
		
		System.out.println(sb);
		
	}
	
	static void merge(int[][] a, int start, int mid, int end) {
		int l = start;
		int r = mid + 1;
		int idx = start;
		
		while(l <= mid && r <= end) {
			if(a[l][1] > a[r][1]) {
				sorted[idx][1] = a[r][1];
				sorted[idx][0] = a[r][0];
				r++;
				idx++;
			}else {
				sorted[idx][1] = a[l][1];
				sorted[idx][0] = a[l][0];
				l++;
				idx++;
			}
		}
		
		if(l > mid) {
			while(r <= end) {
				sorted[idx][1] = a[r][1];
				sorted[idx][0] = a[r][0];
				r++;
				idx++;
			}
		}else {
			while(l <= mid) {
				sorted[idx][1] = a[l][1];
				sorted[idx][0] = a[l][0];
				l++;
				idx++;
			}
		}
		
		for(int i = start; i <= end; i++) {
			a[i][0] = sorted[i][0];
			a[i][1] = sorted[i][1];
		}
//		for(int i = 0; i < N; i++) {
//			System.out.println(a[i][1]);
//		}
//		System.out.println();
	}
	
	static void mergeSort(int[][] a, int start, int end) {
		for(int size = 1; size <= end; size += size) {
			for(int l = 0; l <= end - size; l += 2*size) {
				
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(l + 2*size - 1, end);
				merge(a, low, mid, high);
				
			}
		}
	}
}
//492ms

//StringBuilder 객체 배열을 만들어서 나이에 따라 해당 index stringbuilder에 저장.
//앞에서부터 출력.
//끝! ......딱봐도 더 간단한 방법이긴 하다...