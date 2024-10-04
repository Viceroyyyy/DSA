import java.util.Scanner;
public class SumEvenOdd {
	
	public static void main(String[] args) {
		// Write your code here
		int even=0,odd=0,num,digit=0;
		Scanner a = new Scanner(System.in);
		num = a.nextInt();
		while(num!=0)
		{
			digit=num%10;
			num=num/10;
			if(digit%2==0)
			even+=digit;
			else
			odd+=digit;
		}
		System.out.print(""+even+" "+odd);
		a.close();
	}
}