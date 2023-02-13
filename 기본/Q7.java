import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("n:");
		int n = scn.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++){
		    sum += i;
		}
		System.out.print("sum=" + sum);
		
		
	}
}
