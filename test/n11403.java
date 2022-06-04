import java.util.Scanner;

public class n11403 {

  static int n;
  static int[][] graph = new int[101][101];
  static boolean[] visit = new boolean[101];
  static int[][] solution = new int[101][101];

  public static void input() {
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();

    // 방향 그래프
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int x;
        x = sc.nextInt();
        graph[i][j] = x;
      }
    }
    sc.close();
  }

  public static void dfs(int num) {
    visit[num] = true;

    for (int i = 0; i < n; i++) {
      if (graph[num][i] == 1 && !visit[i]) {
        solution[num][i] = solution[i][num] = 1;
        dfs(i);
      }
    }
  }

  public static void main(String[] args) {
    input();

  }
}
