import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        boolean[] visited = new boolean[game.length];
        
        return canWinHelper(leap, game, 0, visited);
    }

    private static boolean canWinHelper(int leap, int[] game, int index, boolean[] visited) {
        if (index < 0 || index >= game.length || visited[index] || game[index] == 1) {
            return false;
        }
        
        if (index + leap >= game.length || index == game.length - 1) {
            return true;
        }
        
        visited[index] = true;
        
        return canWinHelper(leap, game, index - 1, visited) ||  
               canWinHelper(leap, game, index + 1, visited) || 
               canWinHelper(leap, game, index + leap, visited);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
