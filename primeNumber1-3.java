public class Main
{
	public static void main(String[] args) {
	   // 소수 구하기(1)
	   // 무작정 2부터 99까지 나눠서 나누어 떨어지지 않는 수 구하기
	   // for(int i=2; i<=10; i++){
	   //     int j;
	   //     for(j=2; j<1000; j++){
	   //         if(i%j==0){
	   //             break;
	   //         }
	   //     }
	   //     if(i==j){
	   //         System.out.println(i);
	   //     }
	   // }
	   
	   // 소수 구하기(2)
	   // 소수 배열 생성하고(0번째는 2가 기본값) 홀수로만 가지고 소수 구하기
	   //int[] array = new int[50];
	   //int index = 0;
	   //int count = 0;
	   //array[index++] = 2;
	   
	   //for(int i=3; i<100; i+=2){
	   //    int j;
	   //    for(j=1; j<index; j++){
	   //        if(i%array[j]==0){
	   //            break;
	   //        }
	   //    }
	   //    if(index==j){
	   //        count+=1;
	   //        array[index++] = i;
	   //    }
	   //}
	   
	   //for(int i=0; i<index; i++){
	   //    System.out.println(array[i]);
	   //}
	   
	   
	   // 소수 구하기(3)
	   // 소수 배열 생성하고 어떤 수의 제곱근 제외시켜서 소수 구하기
	   int[] array = new int[50];
	   int index = 0;
	   array[index++] = 2;
	   array[index++] = 3;
	   
	   for(int i=5; i<=100; i+=2){
	       boolean flag = false;
	       for(int j=1; array[j]*array[j]<=i; j++){
	           if(i%array[j]==0){
	               flag = true;
	               break;
	           }
	       }
	       if(!flag){
	           array[index++] = i;
	       }
	   }
	   
	   for(int i=0; i<index; i++){
	       System.out.println(array[i]);
	   }
	}
}
