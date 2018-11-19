package com.ocm22;
import java.util.HashMap;

public class Election {

	public static void main(String[] args)
	{
		String[] vote={"jessy","philip","philip","jessy"};String [] candidate = new String[vote.length];int k=0,v_count;
		for(int i=0;i<vote.length;i++)
		{
			if(i==0)
			{
				candidate[k++]=vote[i];
			}
			else
			{
				if(checkDupicate(vote[i],candidate))
				{
					candidate[k++]=vote[i];
				}
			}
		}
		/*for(String str:candidate)
		{
			System.out.println(str);
		}*/
		
		HashMap<String,Integer> res = new HashMap<String,Integer>();
		int[] x = new int[2];int l=0;
		for(int i=0;i<2;i++)
		{
			v_count = voteCount(candidate[i],vote);
			res.put(candidate[i], v_count);
			x[l++]=charCount(candidate[i]);
			System.out.println(res.get(candidate[i]));
		}
		
		for(int i=0;i<res.size()-1;i++)
		{
			int n=res.get(candidate[i]);
			for(int j=i+1;j<res.size();j++)
			{
				if(n>res.get(candidate[j])){ System.out.println("Winner ->"+candidate[i]);break;}
				if(n==res.get(candidate[j]))
				{
					if(x[i]>x[i+1]) System.out.println("Winner ->"+candidate[i]);
					else System.out.println("Winner -->"+candidate[j]);
				}
			}
		}
		
	}
	
	public static int charCount(String str) 
	{
		return str.length();
	}

	/********************************************************************/
	public static boolean checkDupicate(String s,String[] s1)
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
	public static int voteCount(String s,String[] s1)
	{
		int count =0;
		for(int i=0;i<s1.length;i++)
		{
			if(s==s1[i])
			{
				count++;
			}
		}
		return count;
	}

}
