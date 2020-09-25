import java.util.*;

public class A
{
public static void main(String args[])
{
int a;

int array[]=new int[10];
Scanner scn=new Scanner(System.in);

a=scn.nextInt();

System.out.println("Value of A="+ a);
System.out.println("First argument="+ args[0]);
int sum;
sum=a+ Integer.parseInt(args[0]);
System.out.println("Sum=" + sum);

System.out.println("Enter 10 Elements");
int i;
for(i=0;i<10;i++)
{
array[i]=scn.nextInt();
}

}

}
