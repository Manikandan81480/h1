import java.util.*;
public class hunter1
{
public static void main(String...args)
{
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=x.nextInt();
}
for(int i=0;i<n;i++)
{
if(i==a[i])
{
System.out.println("output"+a[i]);
}
}
}
}
