import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
        System.out.print("n의 값:");
        int n = scn.nextInt();
        
        System.out.print("1부터 n까지의 정수 합 = ");
        if(n%2==0){
            System.out.println((1+n)*(n/2));
        }else{
            System.out.println((2+n)*(n/2)+1);
        }
	}
}
