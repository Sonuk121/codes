package com.ocm22;

import java.util.*;

public class DuplicateValueInList {

	public static void main(String[] args)
	{
		List<Integer> l = new LinkedList<Integer>();
		List<Integer> l1 =new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(20);
		l.add(40);
		for(int i=0;i<l.size()-1;i++)
		{
			int n=l.get(i);
			for(int j=i+1;j<l.size();j++)
			{
				if(n==l.get(j)) l1.add(l.get(i));
			}
		}
		for(int i=0;i<l1.size();i++ )
		{
			System.out.println(l1.get(i));
		}
	}

}
