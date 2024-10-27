import java.util.*;
public class CheckArmstrong {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arm = sc.nextInt();
		int count=0;
		int rem,sum=0,temp;
		temp=arm;
		int temp1=arm;
		while(temp!=0)
		{
			count++;
			temp=temp/10;

		}
		while(arm!=0)
		{
			rem=arm%10;
			arm=arm/10;
			sum=sum+(int)Math.pow(rem,count);
		}
		if(sum==temp1)
		System.out.println("true");
		else
		System.out.println("false");
		
		sc.close();
	}
}
