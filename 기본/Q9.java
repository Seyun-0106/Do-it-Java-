import java.util.Scanner;

public class Main
{
    public static int sumof(int a, int b){
        int sum=0;
        for(int i=a; i<=b; i++){
            sum+=i;
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int a = scn.nextInt();
	    int b = scn.nextInt();
	    
        System.out.println(sumof(a,b));
	}
}
