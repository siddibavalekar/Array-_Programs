//create an array of char type which will accept char input and count how many elements of that array are vowels.
import java.util.Scanner;

class Array_vowels
{
static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{
char arr_char[]=new char[4];
int count=0;
System.out.println("Enter the elements of char array");

	for(int j=0;j<arr_char.length;j++)
	{
	arr_char[j]=sc.next().charAt(0);

         }

	for(int j=0;j<arr_char.length;j++)
	{
	
if(arr_char[j]=='a' ||arr_char[j]=='e' || arr_char[j]=='i' ||arr_char[j]=='o' ||arr_char[j]=='u')
{
count ++;
}
}
System.out.println("The number of vowels in given array is:"+count);
}
}
