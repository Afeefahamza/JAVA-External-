import java.io.*;
import java.util.*;
class Product
{
int code;
String name;
int price;
int[] arr = new int[5];
Scanner sc = new Scanner(System.in);
void read()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the code : ");
code=sc.nextInt();
System.out.println("Enter the name : ");
name=sc.nextLine();
System.out.println("Enter the price : ");
code=sc.nextInt();
}
int find()
{
int min,i;
min=arr[0];
for(i=0;i<5;i++)
{
if(arr[0]<arr[i])
{
min=arr[i];
}
}
return min;
}
void val()
{
try
{
if(length.name<4)
System.out.println("Length is not greater than 4");
}
catch(IOException e)
{
System.out.println("Length of the code is greater than 4");
}
try
{
if(length.name<15)
System.out.println("Length of the name is less than 15");
}
catch(IOException e)
{
System.out.println("Maximum length of name is 15");
}
}
public static void main(String args[]){
Product[] ob = new Product[5];
int i;
for(i=0;i<5;i++)
{
ob.read();
}
ob.find();
ob.val();
}
