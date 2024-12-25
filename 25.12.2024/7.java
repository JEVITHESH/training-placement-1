import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();

            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = md.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                // Convert each byte to a two-digit hexadecimal value
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');  // Append leading zero if needed
                }
                hexString.append(hex);
            }

            System.out.println(hexString.toString());

        } catch (IOException | NoSuchAlgorithmException e) {
            // Handle exceptions
            e.printStackTrace();
        }
    }
}
