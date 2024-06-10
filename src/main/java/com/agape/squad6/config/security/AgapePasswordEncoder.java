package com.agape.squad6.config.security;

import org.springframework.security.crypto.password.PasswordEncoder;

public class AgapePasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.contentEquals(rawPassword);
    }
}
