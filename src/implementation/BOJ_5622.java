package implementation;

import java.io.IOException;
import java.util.HashMap;

public class BOJ_5622 {
	
	static HashMap<String, Integer> map = new HashMap<String, Integer>() {{
		put("A", 3); put("B", 3); put("C", 3);
		put("D", 4); put("E", 4); put("F", 4);
		put("G", 5); put("H", 5); put("I", 5);
		put("J", 6); put("K", 6); put("L", 6);
		put("M", 7); put("N", 7); put("O", 7);
		put("P", 8); put("Q", 8); put("R", 8); put("S", 8);
		put("T", 9); put("U", 9); put("V", 9);
		put("W", 10); put("X", 10); put("Y", 10); put("Z", 10);
	}};
	
	public static void main(String[] args) throws IOException {
		int result = 0;
		
		while(true) {
			int i = System.in.read();
			
			if(i == '\n') break;
			if(map.containsKey(""+(char)i)) result += map.get(""+(char)i);
			
		}
		
		System.out.println(result);
	}
}
