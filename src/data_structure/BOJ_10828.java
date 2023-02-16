package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_10828 {
	
	static List<Integer> list = new ArrayList<>();
	static int len = -1;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		String s;
		
		while(N-- >0) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
				case "pop" : pop(); break;
				case "size" : size(); break;
				case "empty" : empty(); break;
				case "top" : top(); break;
				case "push" :
					if(st.hasMoreTokens()) push(Integer.parseInt(st.nextToken()));
					break;
			}	
		}
		
		System.out.println(sb);
		
		
	}
	
	static void push(int a) {
		list.add(a);
		len++;
	}
	
	static void pop() {
		if(list.isEmpty()) {
			sb.append(-1 + "\n");
			return;
		}
		
		sb.append(list.get(len) + "\n");
		list.remove(len);
		len--;
	}
	
	static void size() {
		sb.append(len + 1 + "\n");
	}
	
	static void empty() {
		if(list.isEmpty()) sb.append(1 + "\n");
		else sb.append(0 + "\n");
	}
	
	static void top() {
		if(list.isEmpty()) {
			sb.append(-1 + "\n");
			return;
		}
		
		sb.append(list.get(len) + "\n");
	}
}
