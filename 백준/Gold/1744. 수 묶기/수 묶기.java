import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pluspq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minuspq = new PriorityQueue<>();
        int one = 0;
        int zero = 0;
        for(int i = 0; i < N; i++){
            int data = sc.nextInt();
            if(data > 1) {
                pluspq.add(data);
            } else if(data == 1){
                one++;
            } else if(data == 0){
                zero++;
            } else {
                minuspq.add(data);
            }
        }
        int sum = 0;
        while(pluspq.size() > 1){
            int first = pluspq.remove();
            int second = pluspq.remove();
            sum = sum + first * second;
        }
        if(!pluspq.isEmpty()){
            sum = sum + pluspq.remove();
        }
        
        while(minuspq.size() > 1){
            int first = minuspq.remove();
            int second = minuspq.remove();
            sum = sum + first * second;
        }
        if(!minuspq.isEmpty()){
            if(zero == 0) {
                sum = sum + minuspq.remove();
            }
        }
        sum = sum + one;
        System.out.println(sum);
    }
}