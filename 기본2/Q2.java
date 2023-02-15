public class Main
{
    static void printArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		 int[] a = {5, 10, 73, 2, -5, 42};
		 int temp;
		 printArray(a);
		 for(int i=0; i<a.length/2; i++){
		     temp = a[i];
		     a[i] = a[a.length-i-1];
		     a[a.length-i-1] = temp;
		     System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n", i, a.length-i);
		     printArray(a);
		 }
		 System.out.println("역순 정렬을 마쳤습니다.");
	}
}
