import java.util.*;
class ArrayString_LinearSearch1
{

static Scanner sc=new Scanner(System.in);
String arr_string []=new String[4];
public static void main(String args[])
{

ArrayString_LinearSearch1 ref=new ArrayString_LinearSearch1();	

	System.out.println("Enter the elements of String array");

	for(int i=0;i<ref.arr_string.length;i++)
	{
	ref.arr_string[i]=sc.next();
        }

System.out.println("Enter value  to check");
		String name=sc.next();
  		
                   int a1=ref.matct_String(name);
			if(a1>=0)
			{
			System.out.println(a1);
			}
			else
			{
			System.out.println("element not found");
			}

}
ArrayString_LinearSearch1()
{

}
	

public int matct_String(String name)
{
	for(int i=0;i<arr_string.length;i++)
	{
		if(arr_string[i].equals(name))
		{
		return i;

 		}
	
         }
return -1;	

}
}
