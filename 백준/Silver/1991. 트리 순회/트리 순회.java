import java.util.*;

public class Main {
    static int[][] tree;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        tree = new int[26][2];
        for(int i = 0; i < N; i++){
            String[] tmp = sc.nextLine().split(" ");
            int node = tmp[0].charAt(0) - 'A';
            char left = tmp[1].charAt(0);
            char right = tmp[2].charAt(0);
            
            if(left == '.') {
                tree[node][0] = -1;
            } else {
                tree[node][0] = left - 'A';
            }
            if(right == '.') {
                tree[node][1] = -1;
            } else {
                tree[node][1] = right - 'A';
            }
        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
        System.out.println();
    }
    public static void preOrder(int now) {
        if(now == -1)
            return;
        System.out.print((char)(now + 'A'));
        preOrder(tree[now][0]);
        preOrder(tree[now][1]);
    }
    public static void inOrder(int now) {
        if(now == -1)
            return;
        inOrder(tree[now][0]);
        System.out.print((char)(now + 'A'));
        inOrder(tree[now][1]);
    }
    public static void postOrder(int now) {
        if(now == -1)
            return;
        postOrder(tree[now][0]);
        postOrder(tree[now][1]);
        System.out.print((char)(now + 'A'));
    }
}