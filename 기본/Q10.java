import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    System.out.print("a의 값 : ");
	    int a = scn.nextInt();
	    System.out.print("b의 값 : ");
        int b = scn.nextInt();
	    do{
	        System.out.println("a보다 큰 값을 입력하세요!");
	        System.out.print("b의 값 : ");
	        b = scn.nextInt();
	    } while(a>b);
	    
	    if(a<b){
	        System.out.println("b-a는 " + (b-a) + "입니다.");
	    }
	}
}
