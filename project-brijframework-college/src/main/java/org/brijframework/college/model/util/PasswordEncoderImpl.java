package org.brijframework.college.model.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoderImpl implements PasswordEncoder{

	 @Override
     public String encode(CharSequence charSequence) {
         return getMd5(charSequence.toString());
     }

     @Override
     public boolean matches(CharSequence userPasswordChars, String dbPasswordEncode) {
     	String PASS1 = getMd5(userPasswordChars.toString());
     	String PASS2 = dbPasswordEncode;
        return PASS1.equals(PASS2);
     }
     
     public static String getMd5(String input) {
 	    try {
 	        MessageDigest md = MessageDigest.getInstance("MD5");
 	        byte[] messageDigest = md.digest(input.getBytes());
 	        BigInteger no = new BigInteger(1, messageDigest);
 	        String hashtext = no.toString(16);
 	        while (hashtext.length() < 32) {
 	            hashtext = "0" + hashtext;
 	        }
 	        return hashtext;
 	    }catch (NoSuchAlgorithmException e) {
 	        System.out.println("Exception thrown for incorrect algorithm: " + e);
 	        return null;
 	    }
 	}
	
}