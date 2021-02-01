import java.util.*;
public class MinAndMax 
{


	
	public static void main(String args[])
	{
		int array[]=new int[10];
		int n, counter;
		int sum=0;
		obj. MinAndMax();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		n=scn.nextInt();
		for(counter=1; counter<10; counter++)
	{
		array[counter]=scn.nextInt();	
	}
	        System.out.println("The 10 Numbers are"); 
		for(int i=0; i<array.length; i++)
		sum= sum+array[i];
		double average = sum/array.length;
		System.out.println("Average value of array elements is: " +average);
		

	}
	void  MinAndMax()
	{
		int array[0];
		int min = array[0];
		int max = array[0];
		for(int i=0; i<=array.length;i++)
		{
			if(array[i]<min) min =array[i];
			if(array[i]<max) max =array[i];	
			System.out.println("Minimum Value is: " +min);
			System.out.println("Maximum Value is: " +max);
		}
		
	}
}