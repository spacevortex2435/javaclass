
import java.util.Scanner;
public class P3 {
    static int N=412,B=105;
    static int[][] a=new int[N][N];
    static int[][][] h=new int[N][N][5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i, j, k, op, x, y;
        double ans = 0, PI = Math.PI, S = (PI / 6.0) + (Math.sqrt(3.0) / 4.0);
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            op = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            x += B;
            y += B;
            if (op == 1) {
                h[x][y][2] = 1;
                h[x + 1][y][1] = 1;
                h[x][y + 1][3] = 1;
                h[x + 1][y + 1][0] = 1;

            } else {
                h[x][y][4] = h[x][y + 1][4] = h[x + 1][y][4] = h[x + 1][y + 1][4] = 1;
            }
        }
        for (i = 1; i <= B * 2; i++) {
            for (j = 1; j <= (B * 2); j++) {
                if (h[i][j][4] > 0) ans += 1;
                else {
                    int cnt = 0;
                    for (k = 0; k < 4; k++) {
                        if (h[i][j][k] > 0) cnt++;
                    }
                    if(cnt==0) continue;
                    if(cnt==1) ans+=PI/4.0;
                    else if (cnt >= 3) {
                        ans += 1.0;
                    } else {
                        if ((h[i][j][0] > 0 && h[i][j][2] > 0) || (h[i][j][1] > 0 && h[i][j][3] > 0)) ans += 1.0;
                        else ans += S;
                        //System.out.println("OK");
                    }
                }
            }
        }
        System.out.printf("%.5f\n",ans);
    }
}
