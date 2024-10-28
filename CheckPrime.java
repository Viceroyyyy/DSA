import java.util.*;
public class CheckPrime {
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
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = isPrime(number);
        System.out.println("Is " + number + " a prime number? " + result);

        scanner.close();
    }
}
