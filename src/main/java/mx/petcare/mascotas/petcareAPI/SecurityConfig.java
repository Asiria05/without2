/*package mx.petcare.mascotas.petcareAPI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.beans.factory.annotation.Autowired;

//import mx.petcare.mascotas.petcareAPI.repository.UserRepository;
//import mx.petcare.mascotas.petcareAPI.service.CustomUserDetailsService;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Deshabilitar CSRF
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/signin", "/signup").permitAll()
                .requestMatchers("/learningResources/**", "/pets/**", "/api/reports", "/api/sharetips/**", "/tips/**", "/api/users/**").hasRole("USER")
                .anyRequest().authenticated()
            )
            .formLogin(withDefaults())
            .rememberMe(withDefaults())
            .logout(logout -> logout.logoutUrl("/signout").permitAll());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        var userDetailsManager = new InMemoryUserDetailsManager();
        userDetailsManager.createUser(User.withUsername("userOne")
                .password(passwordEncoder().encode("userOne"))
                .roles("USER")
                .build());
        userDetailsManager.createUser(User.withUsername("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build());
        return userDetailsManager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
*/
/*
 * @Configuration
 * public class SecurityConfig {
 * 
 * @Bean
 * public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
 * http
 * .csrf().disable() // Deshabilitar CSRF si no estás usando tokens
 * .authorizeHttpRequests(auth -> auth
 * .requestMatchers("/signin", "/signup").permitAll()
 * .requestMatchers("/learningResources/**", "/pets/**", "/api/reports",
 * "/api/sharetips/**", "/tips/**", "/api/users/**").hasRole("USER")
 * .anyRequest().authenticated()
 * )
 * .httpBasic(withDefaults()) // Usar autenticación básica
 * .rememberMe(withDefaults())
 * .logout(logout -> logout.logoutUrl("/signout").permitAll());
 * 
 * return http.build();
 * }
 * 
 * @Bean
 * public UserDetailsService userDetailsService() {
 * return new CustomUserDetailsService(null); // Si estás usando el servicio
 * personalizado
 * }
 * 
 * @Bean
 * public PasswordEncoder passwordEncoder() {
 * return new BCryptPasswordEncoder();
 * }
 * 
 * @Bean
 * public AuthenticationManager
 * authenticationManager(AuthenticationConfiguration
 * authenticationConfiguration)
 * throws Exception {
 * return authenticationConfiguration.getAuthenticationManager();
 * }
 * 
 * }
 */
