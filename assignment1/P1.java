import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        int T,m;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        while((T--)>0)
        {
            m=sc.nextInt();
            if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
