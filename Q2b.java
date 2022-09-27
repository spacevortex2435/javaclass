import java.util.Scanner;
public class Q2b {
    public static void main(String[] args) {
        System.out.println("Please input the precision:");
        double jd,ans=0,las=0;
        int i=0;
        Scanner sc=new Scanner(System.in);
        jd=sc.nextDouble();
        while(true)
        {
            i++;
            if((i&1)==1)
            {
                ans+=(double)4.0/(double)(i*2-1);
            }
            else
            {
                ans-=(double)4.0/(double)(i*2-1);
            }
            if(-jd<ans-las&&ans-las<jd) break;
            las=ans;
        }
        System.out.printf("The estimatioin of Pi is %f\nIt computed %d times",ans,i);
    }
}
