package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		char[] arr= {'a','b','c'};
		int n=3;
		int tot=1<<n;
		for(int N=0;N<tot;N++)
		{
			for(int i=0;i<n;i++)
			{
				int f=1<<i;
				if((f & N) !=0) {
					System.out.print(arr[i]);
				}
			}
			System.out.println();
		}
		
	}
		
	

}
