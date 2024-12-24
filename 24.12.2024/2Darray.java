import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] row = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(row[j]);
            }
        }

        bufferedReader.close();

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int hourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]  // Top row
                                 + arr[i + 1][j + 1]                          // Middle element
                                 + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]; // Bottom row

                maxSum = Math.max(maxSum, hourglassSum);
            }
        }

        System.out.println(maxSum);
    }
}
