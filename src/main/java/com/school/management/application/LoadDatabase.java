package com.school.management.application;

import com.school.management.application.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {

        return args -> {
            /*log.info("Preloading " + userRepository.save(
                    new User("dianazevedei@gmail.com", "parola", "Diana", "Zevedei", "0757000000", "address", "admin")));
            log.info("Preloading " + userRepository.save(
                    new User("bilboBaggins@gmail.com", "bilbo", "Bilbo", "Baggins", "0757000000", "address", "teacher")));
            log.info("Preloading " + userRepository.save(
                    new User("frodoBaggins@gmail.com", "frodo", "Frodo", "Baggins", "0757000000", "address", "student")));*/
        };
    }
}
