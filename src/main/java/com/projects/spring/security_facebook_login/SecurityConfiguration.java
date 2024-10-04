package com.projects.spring.security_facebook_login;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(auth->
                        auth.anyRequest().authenticated()
                )
                .oauth2Login(Customizer.withDefaults());
        return httpSecurity.build();
    }
}
