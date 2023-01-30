package function;

public class BOJ_15596 {
		
		long sum(int[] a){
			
			long result = 0;
			int len = a.length;
			
			for(int i = 0; i < len; i++) {
				result += a[i];
			}
			
			return result;
		}
		
}
