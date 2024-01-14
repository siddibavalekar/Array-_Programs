//Print even and odd number from an array.

import java.util.Scanner;
class Ex_arrayInt_evenodd
{
static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{

int arr_int []=new int[4];

System.out.println("Enter the elements of int array");

	for(int i=0;i<arr_int.length;i++)
	{
	arr_int[i]=sc.nextInt();
	}

	for(int i=0;i<arr_int.length;i++)
	{
	System.out.println("the value at "+i+" "+"index is "+arr_int[i]);

	if(arr_int[i]%2==0)
	{
	System.out.println("number is even:"+arr_int[i]);
	}
	else
	{
	System.out.println("number is odd:"+arr_int[i]);
	}
	}
}
}

