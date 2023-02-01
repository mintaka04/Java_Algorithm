package brute_force;

import java.util.HashSet;

public class BOJ_4673 {
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 1; i < 10000; i++) {
			set.add(findNextNum(i));
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < 10000; i++) {
			if(!set.contains(i)) sb.append(i).append("\n");
		}
		System.out.println(sb);
		
	}
	
	private static int findNextNum(int num) {
		int result = num;
		
		for(int j = 1; j <= 4; j++) {
			result += num%10;
			num /= 10;
		}
		
		return result;
	}
}
