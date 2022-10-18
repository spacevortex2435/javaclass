import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        int T,y,ans,i;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();

        while(T-->0)
        {
            y=sc.nextInt();
            if(((y%4==0)&&((y%100)!=0))||y%400==0)
            {
                System.out.println("Yes");
                ans=307;
                for(i=y+1;i<=1999;i++) {
                    if ((i%4==0&&i%100!=0)|| i % 400 == 0) ans += 366;
                    else ans += 365;
                }
                System.out.printf("%d\n",ans);
            }
            else System.out.println("No");
        }
    }
}
