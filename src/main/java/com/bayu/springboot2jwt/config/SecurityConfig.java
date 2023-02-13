package com.bayu.springboot2jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                // httpBasic mewajibkan untuk menginputkan username dan password
                // username nya adalah user, sedangkan password nya berisi password dari spring security
                .httpBasic()
                .and()
                // formLogin adalah form yang digunakan untuk tampilan login
                .formLogin()
        ;

        return http.build();
    }

}
