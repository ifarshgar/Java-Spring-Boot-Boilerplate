package com.norastudio.server.repository;

import com.norastudio.server.model.Book;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.norastudio.server.repository")
public interface BookRepository extends JpaRepository<Book, Long> {

}
