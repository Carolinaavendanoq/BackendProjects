package mx.com.gm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
// Enable web security
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager users(){
        UserDetails admin = User.builder()
                .username("admin")
                .password("123")
                .roles("USER", "ADMIN")
                .build();

        UserDetails user = User.builder()
                .username("user")
                .password("123")
                .roles("USER")
                .build();

        return  new InMemoryUserDetailsManager(user, admin);

    }

    /*
    @Bean
    protected SecurityFilterChain config(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeHttpRequests()
                .requestMatchers("/edit/**", "/add/**", "/delete")
                .hasAnyRole("ADMIN")
                .requestMatchers("/")
                .hasAnyRole("USER", "ADMIN")
                .and()
                .formLogin((form) -> form
                        .loginPage("/login").permitAll());

        return httpSecurity.build();
    }
    */

}
