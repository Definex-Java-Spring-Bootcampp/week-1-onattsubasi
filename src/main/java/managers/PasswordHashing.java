package main.java.managers;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHashing {

    public static String hashPassword(String password){
        // SHA-512 hash fonksiyonunu kullanmak için MessageDigest nesnesi oluştur      
        MessageDigest md = null;
        // Şifreyi byte dizisine çevir ve hash'le
        byte[] hashedBytes = null;
        try {
            md = MessageDigest.getInstance("SHA-512");
            hashedBytes = md.digest(password.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            System.err.println(e);
        }
        
        // Byte dizisini hex string'e çevir
        return bytesToHex(hashedBytes);
    }
    
    public static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
