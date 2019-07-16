package com.company.programm;

import com.company.programm.services.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.authenticationProvider (authenticationProvider ());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf ().disable ()
                .authorizeRequests ()
                .antMatchers ("/js/**","/css/**","/fonts/**", "/img/**", "login.html*")
                .permitAll ()
                .anyRequest ()
                .fullyAuthenticated ()
                .and ()
                .formLogin ()
                .loginProcessingUrl ("/login") //the URL on which the clients should post the login information
                .usernameParameter ("login") //the username parameter in the queryString, default is 'username'
                .passwordParameter ("password") //the password parameter in the queryString, default is 'password'
                .successHandler (this::loginSuccessHandler)
                .failureHandler (this::loginFailureHandler)
                .and ()
                .logout ()
                .logoutUrl ("/logout") //the URL on which the clients should post if they want to logout
                .logoutSuccessHandler (this::logoutSuccessHandler)
                .invalidateHttpSession (true).permitAll ();

    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider
                = new DaoAuthenticationProvider ();
        authProvider.setUserDetailsService (userDetailsService);
        authProvider.setPasswordEncoder (passwordEncoder ());

        return authProvider;
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder ();
    }

    private void loginSuccessHandler(
            HttpServletRequest request,
            HttpServletResponse response,
            Authentication authentication) throws IOException {

        response.setStatus (HttpStatus.OK.value ());
        response.sendRedirect ("/");

    }

    private void loginFailureHandler(
            HttpServletRequest request,
            HttpServletResponse response,
            AuthenticationException e) throws IOException {

        response.setStatus (HttpStatus.UNAUTHORIZED.value ());
    }

    private void logoutSuccessHandler(
            HttpServletRequest request,
            HttpServletResponse response,
            Authentication authentication) throws IOException {

        response.setStatus (HttpStatus.OK.value ());
        response.sendRedirect ("/login");
    }
}
