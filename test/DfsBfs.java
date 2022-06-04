import java.io.*;
import java.util.*;

public class DfsBfs {
  static int[][] graph;
  static boolean[] visit;
  static int n;
  static int m;
  static int v;

  public static void dfs(int num) {
    visit[num] = true;
    System.out.print(num + " ");

    for (int i = 1; i <= n; i++) {
      if (graph[num][i] == 1 && visit[i] == false) {
        dfs(i);
      }
    }
  }

  public static void bfs() {
    Queue<Integer> q = new LinkedList<Integer>();

    q.offer(v);
    visit[v] = true;
    System.out.print(v + " ");

    while (!q.isEmpty()) {
      int curr = q.poll();

      for (int i = 1; i <= n; i++) {
        if (graph[curr][i] == 1 && visit[i] == false) {
          q.offer(i);
          visit[i] = true;
          System.out.print(i + " ");
        }
      }
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    v = sc.nextInt();

    graph = new int[1001][1001];
    visit = new boolean[1001];

    for (int i = 0; i < m; i++) {
      int u = sc.nextInt();
      int w = sc.nextInt();

      graph[u][w] = graph[w][u] = 1;
    }

    dfs(v);

    visit = new boolean[1001];
    System.out.println();

    bfs();

  }
}