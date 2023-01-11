import java.util.*;
class Odn
{
void odd(int a[],int n)
{
for(int i=0;i<n;i++)
{
if((a[i]%2)!=0)
  System.out.println(a[i]);
}
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int n;
System.out.println("enetr no.of integers you need:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("eneter"+ n +"integers:");
for(int x=0;x<n;x++)
{
a[x]=s.nextInt();
}
Odn o=new Odn();
o.odd(a,n);
}
}