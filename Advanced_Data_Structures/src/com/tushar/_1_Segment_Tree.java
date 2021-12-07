package com.tushar;

import java.util.*;

public class _1_Segment_Tree {
	static int[] ar=new int[100001];
	static int[] st=new int[400004];
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		int n=sc.nextInt();
		int q , l , r;
		for(int i=1;i<=n;i++) ar[i]=sc.nextInt();
	 
		build(1 , 1 , n);
		q=sc.nextInt();
	 
		while(q--!=0)
		{
			l=sc.nextInt();
			r=sc.nextInt();
			System.out.println(query(1 , 1 , n , l+1 , r+1));
		}
		
		

	}
	static void build(int si , int ss , int se)
	{
		if(ss == se)
		{
			st[si] = ar[ss];
			return ;
		}
	 
		int mid = (ss + se) / 2;
		build(2*si , ss , mid);
		build(2*si+1 ,mid+1 , se);
	 
		st[si] = Math.min(st[2*si] , st[2*si+1]);
	}
	 
	static int query(int si , int ss , int se , int qs , int qe)
	{
		if(ss > qe || se < qs) return Integer.MAX_VALUE;
	 
		if(ss >= qs && se <= qe) return st[si];
	 
		int mid = (ss + se) / 2;
	 
		return Math.min(query(2*si , ss , mid , qs , qe) , query(2*si+1 , mid+1 , se , qs , qe));
	}



}

