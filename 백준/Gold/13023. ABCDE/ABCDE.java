import java.util.*;

public class Main{
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static boolean arrive;
    
    public static void main(String[] args){
        arrive = false;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        A = new ArrayList[N];
        visited = new boolean[N];
        
        for(int i = 0; i<N; i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i<M; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            
            A[s].add(e);
            A[e].add(s);
        }
        for(int i = 0; i<N; i++){
            DFS(i,1);
            if(arrive)
                break;
        }
        if(arrive)
            System.out.println("1");
        else
            System.out.println("0");
    }
    public static void DFS(int now, int depth){
        if(depth == 5 || arrive){
            arrive = true;
            return;
        }
        visited[now] = true;
        for(int i : A[now]) {
            if(!visited[i]){
                DFS(i, depth + 1);
            }
        }
        visited[now] = false;
    }
}