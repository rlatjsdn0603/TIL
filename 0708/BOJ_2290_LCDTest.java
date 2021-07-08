import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2290_LCDTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		char[] s = st.nextToken().toCharArray();
		lcd(n,s);
	}
	
	private static void lcd(int n, char[] s) {
		StringBuilder[] sb = new StringBuilder[2*n + 3];
		for(int i = 0; i < 2*n+3; i++) {
			sb[i] = new StringBuilder();
		}
		for(int i = 0; i < s.length; i++) {
			switch(s[i]) {
			case '1':
				//위
				for(int j = 0; j < n+2; j++) {
					sb[0].append(" ");
				}
				for(int j = 1; j < n+1; j++) {
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				for(int j = 0; j < n+2; j++) {
					sb[n+1].append(" ");
				}
				for(int j = n+2; j < 2*n+2; j++) {
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//아래
				for(int j = 0; j < n+2; j++) {
					sb[2*n+2].append(" ");
				}
				//공백
				for(int j = 0; j < 2*n+3; j++) {
					sb[j].append(" ");
				}
				break;
			case '2':
				//윗줄
				sb[0].append(" ");
				for(int j = 0; j < n; j++) {
					sb[0].append("-");
				}
				sb[0].append(" ");
				for(int j = 1; j < n+1; j++) {
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//중간
				sb[n+1].append(" ");
				for(int j = 0; j < n; j++) {
					sb[n+1].append("-");
				}
				sb[n+1].append(" ");
				for(int j = n+2; j < 2*n+2; j++) {
					sb[j].append("|");
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
				}
				//아래
				sb[2*n+2].append(" ");
				for(int j = 0; j < n; j++) {
					sb[2*n+2].append("-");
				}
				sb[2*n+2].append(" ");
				//공백
				for(int j = 0; j < 2*n+3; j++) {
					sb[j].append(" ");
				}
				break;
			case '3':
				//윗줄
				sb[0].append(" ");
				for(int j = 0; j < n; j++) {
					sb[0].append("-");
				}
				sb[0].append(" ");
				for(int j = 1; j < n+1; j++) {
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//중간
				sb[n+1].append(" ");
				for(int j = 0; j < n; j++) {
					sb[n+1].append("-");
				}
				sb[n+1].append(" ");
				for(int j = n+2; j < 2*n+2; j++) {
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//아래
				sb[2*n+2].append(" ");
				for(int j = 0; j < n; j++) {
					sb[2*n+2].append("-");
				}
				sb[2*n+2].append(" ");
				//공백
				for(int j = 0; j < 2*n+3; j++) {
					sb[j].append(" ");
				}
				break;
			case '4':
				for(int j = 0; j < n+2; j++) {
					sb[0].append(" ");
				}
				for(int j = 1; j < n+1; j++) {
					sb[j].append("|");
					for(int k = 1; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//중간
				sb[n+1].append(" ");
				for(int j = 0; j < n; j++) {
					sb[n+1].append("-");
				}
				sb[n+1].append(" ");
				for(int j = n+2; j < 2*n+2; j++) {
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//아래
				for(int j = 0; j < n+2; j++) {
					sb[2*n+2].append(" ");
				}
				//공백
				for(int j = 0; j < 2*n+3; j++) {
					sb[j].append(" ");
				}
				break;
			case '5':
				//윗줄
				sb[0].append(" ");
				for(int j = 0; j < n; j++) {
					sb[0].append("-");
				}
				sb[0].append(" ");
				for(int j = 1; j < n+1; j++) {
					sb[j].append("|");
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
				}
				//중간
				sb[n+1].append(" ");
				for(int j = 0; j < n; j++) {
					sb[n+1].append("-");
				}
				sb[n+1].append(" ");
				for(int j = n+2; j < 2*n+2; j++) {
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//아래
				sb[2*n+2].append(" ");
				for(int j = 0; j < n; j++) {
					sb[2*n+2].append("-");
				}
				sb[2*n+2].append(" ");
				//공백
				for(int j = 0; j < 2*n+3; j++) {
					sb[j].append(" ");
				}
				break;
			case '6':
				//윗줄
				sb[0].append(" ");
				for(int j = 0; j < n; j++) {
					sb[0].append("-");
				}
				sb[0].append(" ");
				for(int j = 1; j < n+1; j++) {
					sb[j].append("|");
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
				}
				//중간
				sb[n+1].append(" ");
				for(int j = 0; j < n; j++) {
					sb[n+1].append("-");
				}
				sb[n+1].append(" ");
				for(int j = n+2; j < 2*n+2; j++) {
					sb[j].append("|");
					for(int k = 1; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//아래
				sb[2*n+2].append(" ");
				for(int j = 0; j < n; j++) {
					sb[2*n+2].append("-");
				}
				sb[2*n+2].append(" ");
				//공백
				for(int j = 0; j < 2*n+3; j++) {
					sb[j].append(" ");
				}
				break;
			case '7':
				sb[0].append(" ");
				for(int j = 0; j < n; j++) {
					sb[0].append("-");
				}
				sb[0].append(" ");
				for(int j = 1; j < n+1; j++) {
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//중간
				for(int j = 0; j < n+2; j++) {
					sb[n+1].append(" ");
				}
				for(int j = n+2; j < 2*n+2; j++) {
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//아래
				for(int j = 0; j < n+2; j++) {
					sb[2*n+2].append(" ");
				}
				//공백
				for(int j = 0; j < 2*n+3; j++) {
					sb[j].append(" ");
				}
				break;
			case '8':
				//윗줄
				sb[0].append(" ");
				for(int j = 0; j < n; j++) {
					sb[0].append("-");
				}
				sb[0].append(" ");
				for(int j = 1; j < n+1; j++) {
					sb[j].append("|");
					for(int k = 1; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//중간
				sb[n+1].append(" ");
				for(int j = 0; j < n; j++) {
					sb[n+1].append("-");
				}
				sb[n+1].append(" ");
				for(int j = n+2; j < 2*n+2; j++) {
					sb[j].append("|");
					for(int k = 1; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//아래
				sb[2*n+2].append(" ");
				for(int j = 0; j < n; j++) {
					sb[2*n+2].append("-");
				}
				sb[2*n+2].append(" ");
				//공백
				for(int j = 0; j < 2*n+3; j++) {
					sb[j].append(" ");
				}
				break;
			case '9':
				//윗줄
				sb[0].append(" ");
				for(int j = 0; j < n; j++) {
					sb[0].append("-");
				}
				sb[0].append(" ");
				for(int j = 1; j < n+1; j++) {
					sb[j].append("|");
					for(int k = 1; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//중간
				sb[n+1].append(" ");
				for(int j = 0; j < n; j++) {
					sb[n+1].append("-");
				}
				sb[n+1].append(" ");
				for(int j = n+2; j < 2*n+2; j++) {
					for(int k = 0; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//아래
				sb[2*n+2].append(" ");
				for(int j = 0; j < n; j++) {
					sb[2*n+2].append("-");
				}
				sb[2*n+2].append(" ");
				//공백
				for(int j = 0; j < 2*n+3; j++) {
					sb[j].append(" ");
				}
				break;
			case '0':
				//윗줄
				sb[0].append(" ");
				for(int j = 0; j < n; j++) {
					sb[0].append("-");
				}
				sb[0].append(" ");
				for(int j = 1; j < n+1; j++) {
					sb[j].append("|");
					for(int k = 1; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//중간
				for(int j = 0; j < n+2; j++) {
					sb[n+1].append(" ");
				}
				for(int j = n+2; j < 2*n+2; j++) {
					sb[j].append("|");
					for(int k = 1; k < n+1; k++) {
						sb[j].append(" ");
					}
					sb[j].append("|");
				}
				//아래
				sb[2*n+2].append(" ");
				for(int j = 0; j < n; j++) {
					sb[2*n+2].append("-");
				}
				sb[2*n+2].append(" ");
				//공백
				for(int j = 0; j < 2*n+3; j++) {
					sb[j].append(" ");
				}
				break;
			}
		}
		for(int i = 0; i < 2*n+3; i++) {
			System.out.println(sb[i]);
		}
	}
}
