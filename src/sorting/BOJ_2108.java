package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

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
		double total = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}

		mergeSort(arr, 0, N-1);
		
		int mode = 4001;
		
		//<숫자, 횟수> 로 hashmap에 저장
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();		
		for(int n : arr) hm.put(n, hm.getOrDefault(n, 0) + 1);
		
		//가장 큰 횟수 maxTimes에 추출
		int maxTimes = 0;
		for(int val : hm.values()) maxTimes = Math.max(maxTimes, val);
		
		//value가 maxTimes인 key들 저장
		List<Integer> list = new ArrayList<>();
		for(int key : hm.keySet()) {
			if(hm.get(key) == maxTimes) list.add(key);
		}
		
		if(list.size() > 1) {
			Collections.sort(list);
			mode = list.get(1);
		}else mode = list.get(0);
		
		
		
		double sum = total/N;
		sb.append(Math.round(sum) + "\n");
		
		sb.append(arr[N/2] + "\n");
		sb.append(mode + "\n");
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
