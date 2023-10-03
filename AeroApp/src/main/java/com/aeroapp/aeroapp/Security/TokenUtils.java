package com.aeroapp.aeroapp.Security;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtils {

    private final static String ACCESS_TOKEN = "eyJhbGciOiJSUzUxMiIsInR5cCI6IkpXVCJ9";
    private final static Long ACCESS_TOKEN_VALIDITY_SECONDS = 2592000L;


    public static String createToken(String lastName, String reservationCode){

        long expirationTime = ACCESS_TOKEN_VALIDITY_SECONDS + 1000;
        Date expirationDate = new Date(System.currentTimeMillis() + expirationTime);

        Map<String, Object> extra = new HashMap<>();
        extra.put("lastName: ", lastName);


        return Jwts.builder()
                .setSubject(reservationCode)
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN.getBytes()))
                .compact();
    }


}
