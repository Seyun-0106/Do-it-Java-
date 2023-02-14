import java.util.Random;

public class Main
{
    static int maxOf(int[] a){
        int max = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]>max){
                 max = a[i];
            }
        }
            return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();

		System.out.println("키의 최댓값을 구합니다.");
		int num = 1 + rand.nextInt(20);
		int[] height = new int[num];

		System.out.println("사람 수 : " + num);
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);      // 요솟값을 난수로 결정
			System.out.println("height[" + i + "] : " + height[i]);
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}
