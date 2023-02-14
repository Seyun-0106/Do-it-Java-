import java.util.Scanner;

public class Main
{
    public static void spira(int n){
        int num=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i*2+1; k++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    System.out.print("n = ");
	    int n = scn.nextInt();
	    spira(n);
	}
}
