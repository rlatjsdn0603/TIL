import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5557_1학년 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		long[] dp = new long[21];
		dp[Integer.parseInt(st.nextToken())]++;
		for(int j = 0; j < n-2; j++) {
			int next = Integer.parseInt(st.nextToken());
			long[] dp1 = new long[21];
			for(int i = 0; i < 21; i++) {
				if(dp[i] != 0) {
					int n1 = i + next;
					int n2 = i - next; 
					if(n1 <= 20 && n1 >= 0) dp1[n1] += dp[i];
					if(n2 <= 20 && n2 >= 0) dp1[n2] += dp[i];
				}
			}
			for(int i = 0; i < 21; i++) {
				dp[i] = dp1[i];
			}
		}
		System.out.println(dp[Integer.parseInt(st.nextToken())]);
	}
}
