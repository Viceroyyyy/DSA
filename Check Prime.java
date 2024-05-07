import java.util.*;
public class Solution {
	public static String isPrime(int num) {
		if(num==1)
		return "NO";

		int count=0;
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			count++;
		}
		if(count>0)
		return "NO";
		else
		return "YES";

	
	}
}
