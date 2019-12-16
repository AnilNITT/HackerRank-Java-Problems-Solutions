import java.util.*;
public class Main {
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        //String str;
        String s=sc.nextLine();
        int n=sc.nextInt();
        int m=s.length();
        int p=n/m;
        
        for(int i=0;i<p;i++)
        {
            System.out.print(s);
        }
        int q=p*m;
        int r=n-q;
        if(n>q)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(s.charAt(j));
            }
        }
        
    }
}
