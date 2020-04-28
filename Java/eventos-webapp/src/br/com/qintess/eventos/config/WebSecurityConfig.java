package br.com.qintess.eventos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.qintess.eventos.service.ClientLoginService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private ClientLoginService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(encoder());
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager customAuthenticationManager() throws Exception {
		return authenticationManager();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/resources/**").permitAll()
				.antMatchers("/eventDetails/**").hasAnyRole("USER", "ADMIN")
				.antMatchers("/concertHall/**").hasAnyRole("OWNER", "ADMIN")
				.antMatchers("/eventRegistration/**").hasAnyRole("OWNER", "ADMIN")
				.antMatchers("/signUpView", "/signUp", "/doSignUp").permitAll()
				.antMatchers("/").permitAll()
				.anyRequest().authenticated()
			.and()
			.formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/process")
				.permitAll()
			.and()
			.logout()
				.logoutUrl("/logout")
				.invalidateHttpSession(true)
				.logoutSuccessUrl("/")
			.and()
			.exceptionHandling()
				.accessDeniedPage("/accessDenied")
			.and()
			.csrf().disable();
			
	}
	
	
	
}
