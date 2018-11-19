package com.ocm22;
public class RemoveDuplicates {

	public static void main(String[] args) 
	{

		int[] arr={1,2,3,4,2,1,2,3};int [] fresh = new int[arr.length];int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i==0)
			{
				fresh[k++]=arr[i];
			}
			else
			{
				if(checkDupicate(arr[i],fresh))
				{
					fresh[k++]=arr[i];
				}
			}
		}
		for(int str:fresh)
		{
			System.out.println(str);
		}
	}
	public static boolean checkDupicate(int s,int[] s1)
	{
		for(int i=0;i<s1.length;i++)
		{
			if(s==s1[i])
			{
				return false;
			}
		}
		return true;
	}

}
