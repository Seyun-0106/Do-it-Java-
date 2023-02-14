import java.util.Scanner;

public class Main
{
    public static void triangleLB(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangleLU(int n){
        for(int i=0; i<n; i++){
            for(int j=n-i; j>0; j++){
                System.out.print("-");
            }
            System.out.print("*");
            System.out.println();
        }
    }
    public static void triangleRU(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangleRB(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    System.out.print("n = ");
	    int n = scn.nextInt();
	    //triangleLB(3);
	    //triangleLU(3);
	    //triangleRU(3);
	    triangleRB(n);
	}
}
