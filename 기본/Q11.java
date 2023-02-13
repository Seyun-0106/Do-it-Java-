import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    System.out.print("양의 정수를 입력하세요 ->");
	    int n = scn.nextInt();
	    int cnt = 1;
	    while(n/10>0){
	        n = n/10;
	        cnt++;
	    }
	    System.out.print("그 수는 "+cnt+"자리입니다.");
	}
}
