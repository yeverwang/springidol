package com.yever.springidol.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ASUS on 2017/5/22.
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByAuthor(String author);
}
