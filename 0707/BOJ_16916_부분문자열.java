import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16916_부분문자열 {
	
	public static char[] s1;
	public static char[] s2;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		s1 = st.nextToken().toCharArray();
		st = new StringTokenizer(br.readLine()," ");
		s2 = st.nextToken().toCharArray();
		int p = getP();
		int ans = 0;
		for(int i = 0; i < s1.length; i++) {
			int same = 0;
			for(int j = 0; j < s2.length; j++) {
				if(s1[i+j] == s2[j]) continue;
				else {
					same = j; //여기 고쳐야함
					break;
				}
			}
			if(p > same) i = i + same; //여기 고쳐야함
			else i = i+p;
		}
	}
	
	private static int getP() {
		int p = 0;
		loop : 
		for(int i = 0; i < s2.length; i++) {
			for(int j = 0; j < i; j++) {
				if(s2[j] == s2[s2.length-1-i+j]) continue;
				else {
					break loop;
				}
			}
			p++;
		}
		return p;
	}
}
