import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        List<ArrayList<Integer>> lines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int numCount = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < numCount; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }
        
        int q = scanner.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;the line
            
            if (x >= 0 && x < n && y >= 0 && y < lines.get(x).size()) {
                System.out.println(lines.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        scanner.close();
    }
}
