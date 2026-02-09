package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/employee/add").hasRole("ADMIN")
            .antMatchers("/employee/delete/**").hasRole("ADMIN")
            .antMatchers("/employee/list").hasAnyRole("ADMIN","MANAGER")
            .and()
            .formLogin();
    }
}
