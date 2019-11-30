public class MyClass {
    public static void main(String args[]) {
    StringBuilder s=new StringBuilder();
        for(int i=1;i<101;i++)
        {
            if(i%3==0 && i%5==0)
            {
                s.append("Fizz"+"\n");
            }
            else if(i%3==0)
            {
                s.append("Buzz"+"\n");
            }
            else if(i%5==0)
            {
                s.append("FizzBuzz"+"\n");
            }
            else
            {
                s.append(i+"\n");
            }
           
        } System.out.println(s);
    }
}
