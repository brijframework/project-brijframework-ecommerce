package org.brijframework.college;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new PasswordEncoder() {
	        @Override
	        public String encode(CharSequence charSequence) {
	            return getMd5(charSequence.toString());
	        }

	        @Override
	        public boolean matches(CharSequence charSequence, String s) {
	        	
	        	String PASS1 = getMd5(charSequence.toString());
	        	String PASS2 = s;
	        	System.out.println("charSequence="+charSequence.toString());
	        	System.out.println("PASS1="+PASS1);
	        	System.out.println("PASS2="+PASS2);
	        	
	            return PASS1.equals(PASS2);
	        }
	    };
	}

	public static String getMd5(String input) {
	    try {
	        // Static getInstance method is called with hashing SHA
	        MessageDigest md = MessageDigest.getInstance("MD5");

	        // digest() method called
	        // to calculate message digest of an input
	        // and return array of byte
	        byte[] messageDigest = md.digest(input.getBytes());

	        // Convert byte array into signum representation
	        BigInteger no = new BigInteger(1, messageDigest);

	        // Convert message digest into hex value
	        String hashtext = no.toString(16);

	        while (hashtext.length() < 32) {
	            hashtext = "0" + hashtext;
	        }

	        return hashtext;
	    }

	    // For specifying wrong message digest algorithms
	    catch (NoSuchAlgorithmException e) {
	        System.out.println("Exception thrown"
	                + " for incorrect algorithm: " + e);
	        return null;
	    }
	}
	
	public static void main(String[] args) {
		System.out.println(getMd5("e10adc3949ba59abbe56e057f20f883e"));
	}
	
	@Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	auth.authenticationProvider(authenticationProvider());
    }

	@Override
	public void configure(HttpSecurity http) throws Exception {
		 http.authorizeRequests()
         .and()
         .formLogin().loginPage("/login").usernameParameter("j_username").passwordParameter("j_password").permitAll()
         .loginProcessingUrl("/j_spring_security_check")
         .successForwardUrl("/home")
         .failureUrl("/loginFailed")
         .permitAll()
         .and()
         .logout().logoutSuccessUrl("/logout")
         .and()
         .csrf().disable();
	}

}