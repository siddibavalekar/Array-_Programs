import java.util.Scanner;
class Array_binarySearch
{
static Scanner sc=new Scanner(System.in);
int arr_int []=new int[4];

public static void main(String args[])
{
Array_binarySearch ref=new Array_binarySearch();

	System.out.println("Enter the elements of int array");

	for(int i=0;i<ref.arr_int.length;i++)
	{
	ref.arr_int[i]=sc.nextInt();

        }

	System.out.println("Enter value  to check");
	 int a=sc.nextInt();

       ref.find_match(a);

}

	public void find_match(int a)
	{

	int pos=-1;
	int s=0;
	int e=arr_int.length-1;

		for(int i=0;i<arr_int.length;i++)
		{
		int mid=(s+e)/2;

		if(arr_int[mid]==a)
		{
		pos=mid;
		break;
		}
			

		else if(arr_int[mid]>a)
		{
		e=mid;
		}

		else
		{
		s=mid;
		}

		}

if(pos>=0)
{
System.out.println(pos +"is index");
}

else
{
System.out.println("the value is not present in array");
}

}
}