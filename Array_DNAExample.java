//create an array and store given data {"000101101110001101","111010011000101100","0001001101110001010","111100011011100101010"}
//check first  three character. if first char are 000 and 111 then print( 000=DNA and 111=RNA)

import java.util.Scanner;
class Array_DNAExample
{
static Scanner sc=new Scanner(System.in);
static String arr[]={"000101101110001101","111010011000101100","0001001101110001010","111100011011100101010"};

public static void main(String args[])
{

dna_array();
}

public static void dna_array()
{
	for(int i=0;i<arr.length;i++)
	{
		String a="";
		for(int j=0;j<3;j++)
		{
			//if((arr[i].charAt(j)='0') || (arr[i].charAt(j)='1'))
			//{
				a=a+arr[i].charAt(j);
			//}
		}
		if(a.equals("000"))
		{
			System.out.println("DNA");
		}
		else if(a.equals("111"))
		{
			System.out.println("RNA");
		}
		else
		{
			System.out.println("not valid");
		}
	}

}
}