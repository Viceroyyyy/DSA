import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner Solution = new Scanner(System.in);
		int num = Solution.nextInt();
		int x=0,y=0,fibn=0;

		for(int i=1;i<=num;i++)
		{
			if(i==1)
			x=1;
			else if(i==2)
			y=1;
			else
			{fibn=x+y;
			x=y;
			y=fibn;}
		}
		if(num==1 || num==2)
		System.out.println("1");
		else
		System.out.println(""+fibn);

		
	}

}
