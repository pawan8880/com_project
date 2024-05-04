package com.eCommerceProject.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
 * @Component public class CreateCodeServiceImpl implements CreateCodeService{
 * 
 * @Override public String createCode() { int length = 5;
 * 
 * return RandomString.make(length); } }
 */
import java.util.Random;

@Component
public class CreateCodeServiceImpl implements CreateCodeService {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    @Override
    public String createCode() {
        int length = 5;
        return generateRandomString(length);
    }

    private String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
