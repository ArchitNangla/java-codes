import java.io.*;
class add
{
    public static void main(String args[]) throws Exception
    {
        int a,b,sum;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first number:");
        a=Integer.parseInt(br.readLine());
        System.out.println("enter second number:");
        b=Integer.parseInt(br.readLine());
        sum=a+b;
        System.out.println("Addition="+sum);


    }
}
