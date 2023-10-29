package moses.zal.SecurityMicroService.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {
  @Bean
  public UserDetailsManager userDetailsManager(DataSource dataSource) {
    return new JdbcUserDetailsManager(dataSource);
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(configurer ->
            configurer
                    .requestMatchers(HttpMethod.GET, "/api/edufy/security/users").hasRole("ADMIN")
                    .requestMatchers(HttpMethod.DELETE, "/api/edufy/security/users/{username}").hasRole("ADMIN")
                    .requestMatchers(HttpMethod.PUT, "/api/edufy/security/users&roles/{role_ID}").hasRole("ADMIN")
                    .requestMatchers(HttpMethod.POST, "/api/edufy/security/users/newuser").hasRole("ADMIN")
                    .anyRequest().authenticated()
    );
    http.httpBasic(Customizer.withDefaults());
    http.csrf(AbstractHttpConfigurer::disable);
    return http.build();
  }
}
