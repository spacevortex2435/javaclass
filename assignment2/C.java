import java.util.Arrays;
import java.util.Scanner;
class Course
{
    int fs,w;

}
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T;
        int i,Z,id,ans;
        T=sc.nextInt();
        Course s[] =new Course[10];
        for(i=1;i<=4;i++) s[i]=new Course();//!!!!!!!!!!!!!!!!!!!!!
        while((T--)>0)
        {
            Z=0;ans=0;
            for(i=1;i<=4;i++) {s[i].fs=sc.nextInt();Z+=s[i].fs;}
            for(i=1;i<=4;i++) s[i].w=sc.nextInt();
            while(Z<100)
            {
                Z++;
                id=-1;
                for(i=1;i<=4;i++)
                {
                    //System.out.printf("#%d  %d\n",i,s[i].w);
                    if(s[i].fs==30) continue;
                    if(id==-1||s[i].w<s[id].w) id=i;
                }
                s[id].fs++;ans+=s[id].w;
                //System.out.printf("%d  %d\n",Z,ans);
            }
            System.out.printf("%d\n",ans);
        }
    }
}
