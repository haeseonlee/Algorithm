import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int max = A[0];
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > max) max = A[i];
            sum = sum + A[i]; 
        }
        System.out.println(sum * 100.0 / max / N);
    }
}