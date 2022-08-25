package com.example.productmgmt.config;

import com.example.productmgmt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    /**
     * Used to proeed to the authentication of the users from the Database
     * @param auth AuthenticationManagerBuilder
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(userService).passwordEncoder(encoder());

        /*auth.inMemoryAuthentication()
                .withUser("moussa")
                .password(encoder().encode("123"))
                .roles("user")
                .and()
                .withUser("ali")
                .password(encoder().encode("123"))
                .roles("admin")
        ;*/
    }

    /**
     * Used to initialize the Authentication process by creating the Object
     * @return new AuthenticationManager
     * @throws Exception
     */
    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    /**
     * Used to add filter to the endpoints
     * Override the security for the application needs
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/users/**").hasRole("ADMIN")
                .antMatchers("/stocks/**").hasRole("Manager")
                .antMatchers("/orders/**").hasRole("Vendor")
                .anyRequest().authenticated()
                .and().logout()
                .and()
                .httpBasic()
        ;
    }

    /**
     * Implemented to create the SecurityContext
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {

    }

    /**
     * Used to encode and decode all the passwords
     * @return PasswordEncoder
     */
    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
