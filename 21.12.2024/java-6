import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Read the number of test cases
        int testCases = Integer.parseInt(in.nextLine());
        
        // Process each test case
        while (testCases-- > 0) {
            String pattern = in.nextLine();
            
            // Try compiling the regex pattern
            try {
                // Try to compile the pattern
                Pattern.compile(pattern);
                // If successful, it's a valid regex
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                // If an exception is thrown, it's an invalid regex
                System.out.println("Invalid");
            }
        }
        
        // Close the scanner
        in.close();
    }
}
