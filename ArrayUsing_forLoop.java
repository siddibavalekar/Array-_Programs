//create an array of String,int,char type and store 4 elements in array

import java.util.Scanner;
class ArrayUsing_forLoop
{
static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{

String arr_string []=new String[4];
char arr_char []=new char[4];
int arr_int []=new int[4];
double arr_double []=new double[4];


//STRING ARRAY

System.out.println("Enter the elements of String array");

	for(int i=0;i<arr_string.length;i++)
	{
	arr_string[i]=sc.nextLine();

//System.out.println("Enter the elements of char array");  //we can also do this way 
//arr_char[i]=sc.next().charAt(0);
        }

for(int i=0;i<arr_string.length;i++)
	{
	System.out.println("the value at "+ i +" "+"index is "+arr_string[i]);

         }

//CHAR ARRAY

System.out.println("Enter the elements of char array");

	for(int i=0;i<arr_char.length;i++)
	{
	arr_char[i]=sc.next().charAt(0);

         }

	for(int i=0;i<arr_char.length;i++)
	{
	System.out.println("the value at "+ i +" "+"index is "+arr_char[i]);

         }
//INT ARRAY

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
System.out.println("number is even"+arr_int[i]);
}
else
{
System.out.println("number os odd"+arr_int[i]);
}

	}
//DOUBLE ARRAY

System.out.println("Enter the elements of double array");

	for(int i=0;i<arr_double.length;i++)
	{
	arr_double[i]=sc.nextDouble();

         }
	for(int i=0;i<arr_double.length;i++)
	{
	System.out.println("the value at "+i+" "+"index is "+arr_double[i]);

	}

}
}


