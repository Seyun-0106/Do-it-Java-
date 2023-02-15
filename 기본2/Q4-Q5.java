import java.util.Scanner;
public class Main
{
    static void copy(int[] a, int[] b){
        a = b.clone();
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void rcopy(int[] a, int[] b){
        for(int i=0; i<b.length; i++){
            a[b.length-i-1] = b[i];
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    
		 int[] a = {5, 10, 73, 2, -5, 42};
		 int[] b = new int[6];
		 
		 for(int i=0; i<b.length; i++){
		     b[i] = scn.nextInt();
		 }
		 copy(a, b);
		 rcopy(a, b);
	}
}
