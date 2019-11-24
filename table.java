import java.util.*;
class table
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n,i,z;
        System.out.println("enter the number for printing table");
        n=sc.nextInt();
        System.out.println("the table of "+n+"is");
        for(i=1;i<=10;i++)
        {
           z=i*n;
           System.out.println(+z);
        }
    }
} 