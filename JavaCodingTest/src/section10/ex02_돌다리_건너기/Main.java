package section10.ex02_돌다리_건너기;

import java.util.Scanner;

public class Main {
    static int[] dy;

    private int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n + 1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n + 1];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n + 2];
        System.out.print(T.solution(n));
    }
}
