package it.bandadirecco.musicarchive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class MusicArchive {
    public static void main(String[] args) {
        SpringApplication.run(MusicArchive.class);
    }
}