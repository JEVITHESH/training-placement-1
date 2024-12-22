import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int operations = sc.nextInt();
        
        BitSet bitSet1 = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);
        
        for (int i = 0; i < operations; i++) {
          
            String operation = sc.next();
            
            if (operation.equals("AND")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x == 1) {
                    bitSet1.and(bitSet2);
                } else {
                    bitSet2.and(bitSet1);
                }
            } else if (operation.equals("OR")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x == 1) {
                    bitSet1.or(bitSet2);
                } else {
                    bitSet2.or(bitSet1);
                }
            } else if (operation.equals("XOR")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x == 1) {
                    bitSet1.xor(bitSet2);
                } else {
                    bitSet2.xor(bitSet1);
                }
            } else if (operation.equals("FLIP")) {
                int x = sc.nextInt();
                int index = sc.nextInt();
                if (x == 1) {
                    bitSet1.flip(index);
                } else {
                    bitSet2.flip(index);
                }
            } else if (operation.equals("SET")) {
                int x = sc.nextInt();
                int index = sc.nextInt();
                if (x == 1) {
                    bitSet1.set(index);
                } else {
                    bitSet2.set(index);
                }
            }
            
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
        
        sc.close();
    }
}
