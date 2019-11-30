public class Solution 
{ // Complete the repeatedString function below.
    static long repeatedString(String s, long n) 
    {
        long m=s.length();
        long p=n/m;
        String s1="";
        for(long i=0;i<p;i++)
            s1=s1+s;
        if(n>(p*m))
        {   for(int j=0;j<(n-(p*m));j++)
                s1+=s.charAt(j);    
        }
        long count=0;
        for(int k=0;k<n;k++)
        {   if(s1.charAt(k)=='a')
               count++;   
        }
        return count;    
    }

