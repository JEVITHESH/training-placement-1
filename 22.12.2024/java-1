import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int seriesValue = a;
            for (int j = 0; j < n; j++) {
                seriesValue += (Math.pow(2, j) * b);
                System.out.print(seriesValue + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
