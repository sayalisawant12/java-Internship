import java.util.*;
public class PassGen {
    public static void main(String[] args){
        
        int length = 10;
        System.out.println(New_Password(length));
    }

    static char[] New_Password(int length) {

        System.out.println("Generating password:");
        System.out.print("Your new password is  ");
        String Capital_chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers ="0123456789";
        String symbols="!@#$%^&*-+/<>.";

        String values =Capital_chars + Small_chars + numbers + symbols;

        Random rndm_method = new Random();
        char[] password = new char[length];

        for(int i=0;i<length;i++) {

           password[i]=values.charAt(rndm_method.nextInt(values.length()));

        }
        
        return password;

    }
    
}
