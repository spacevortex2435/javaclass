import java.util.Scanner;
public class Q2a {
    public static void main(String[] args) {
        System.out.println("Please input n:");
        Scanner sc=new Scanner(System.in);
        int n,i;
        double ans=0,B=4.0,now;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            //System.out.printf("%d  %f\n",i,ans);
            now=i*2-1;
            if((i&1)==1)
            {
                ans+=(B/now);
            }
            else
            {
                ans-=(B/now);
            }
        }
        System.out.printf("The estimatioin of Pi is %f",ans);
    }
}
