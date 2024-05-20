package com.savvycom.springjwt;


import com.savvycom.springjwt.Repository.UserRepository;
import com.savvycom.springjwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringjwtApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringjwtApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("thang");
		user.setPassword(passwordEncoder.encode("thang"));
		userRepository.save(user);
		System.out.println(user);
	}
}
