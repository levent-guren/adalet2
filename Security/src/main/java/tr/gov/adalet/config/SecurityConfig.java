package tr.gov.adalet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	@Bean
	UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("levent")
				// şifre abc
				.password("$2a$10$T/fS1itUNnJtWU48BdP/YOTb/fSX.YaD1QzmPdavjIdqCk5IPZI3a")
				.roles("user").build());
		manager.createUser(User.withUsername("admin")
				.password("$2a$10$xbeTfJRkTwYPchq9ZCxbNOdNIz0UTo2yNvxeWZbkygzPrDvisGzs.")
				.roles("admin", "user").build());
		return manager;
	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		// @formatter:off
		http.cors().and().csrf().disable()
		.authorizeRequests()
		.antMatchers("/").hasRole("admin")
		.antMatchers("/id/**").permitAll()
		.anyRequest().authenticated()
		.and().formLogin()
		;
		// @formatter:on
		return http.build();
	}

	@Bean
	PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("abc"));
	}
}
