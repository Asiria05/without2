/*package mx.petcare.mascotas.petcareAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.authority.AuthorityUtils;

import mx.petcare.mascotas.petcareAPI.model.User;
import mx.petcare.mascotas.petcareAPI.exception.ExceptionHandlerAdvice;
import mx.petcare.mascotas.petcareAPI.repository.UserRepository;
import org.springframework.stereotype.Service;
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Try to find the user by email (or username, depending on how you implement it)
        User user = userRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + username));

        // Return a UserDetails object containing the user information
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), 
                user.getPassword(), 
                AuthorityUtils.createAuthorityList("ROLE_USER") // Assuming the default role is USER
        );
    }
}
*/