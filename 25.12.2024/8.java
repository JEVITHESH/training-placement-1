import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) {
       
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine().trim();

          
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());

          
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02x", b)); // Format as hexadecimal
            }

           
            System.out.println(hexString.toString());

        } catch (IOException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
