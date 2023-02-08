package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2108 {
	
	static int N;
	static int[] arr;
	static int[] sorted;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		sorted = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		mergeSort(arr, 0, N-1);
		
		int mode = 4001; 		//최빈값
		int value = arr[0]; 	//현재 탐색중인 값
		int count = 1;			//value가 현재 몇 번 나타나는지
		int mode_count = 1; 	//현재 최빈값의 빈도
		boolean flag = false;	//두번째 작은값 체크 flag
		
		for(int i = 1; i < N; i++) {
			
			//다음 값이 현재 value와 같은지 확인
			//같다면 => count++, mode_count++
			//다르다면 => value값을 또 바꿔주기.
			//최빈값... 뭔데 복잡한 것 같지...
		}
		
		
		
		
		
		
		if(sum < 0) sb.append("-");
		sb.append(Math.round(Math.abs(sum/N)) + "\n");
		
		sb.append(arr[N/2] + "\n");
		sb.append(false + "\n");
		sb.append(arr[N-1] - arr[0]);
		
		System.out.println(sb);
	}
	
	
	static void merge(int[] a, int start, int mid, int end) {
		int l = start;
		int r = mid + 1;
		int idx = start;
		
		while(l <= mid && r <= end) {
			if(a[l] > a[r]) {
				sorted[idx] = a[r];
				idx++;
				r++;
			}else {
				sorted[idx] = a[l];
				idx++;
				l++;
			}
		}
		
		if(l > mid) {
			while(r <= end) {
				sorted[idx] = a[r];
				idx++;
				r++;
			}
		}else {
			while(l <= mid) {
				sorted[idx] = a[l];
				idx++;
				l++;
			}
		}
		
		for(int i = start; i <= end; i++) {
			a[i] = sorted[i];
		}
	}
	
	static void mergeSort(int[] a, int start, int end) {
		for(int size = 1; size <= end; size += size) {
			for(int l = 0; l <= end - size; l += 2*size) {
				
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(end,  l + 2*size - 1);
				merge(a, low, mid, high);
				
			}
		}
	}
}
