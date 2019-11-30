public class MyClass {
    public static void main(String args[]) {
      String s1="HELLO";
      String s2="GITHUBANIL";
       int m=s1.length();
       int n=s2.length();
       StringBuilder s3 = new StringBuilder(); 
       int i = 0, j = 0; 
        while (i < s1.length() && j < s2.length()) 
        {
            s3.append(s1.charAt(i++)); 
            s3.append(s2.charAt(j++)); 
        }
         
        if (i != s1.length())
        { 
            s3.append(s1.substring(i)); 
        } 
        if (j != s2.length()) 
        { 
            s3.append(s2.substring(j)); 
        } 
        System.out.println(s3.toString()); 
    }
}
