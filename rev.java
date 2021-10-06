import java.io.*;
import java.util.*;
class rev
{
public static void main(String args[])
{
int m,n,r=0,d=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
n = sc.nextInt();
m=n;
while(n!=0)
{
r=n%10;
d=(d*10)+r;
n=n/10;
}
System.out.print("The reverse of the number "+m+" is "+d);
}
}

