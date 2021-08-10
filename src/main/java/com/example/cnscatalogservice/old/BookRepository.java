package com.example.cnscatalogservice.old;

import com.example.cnscatalogservice.domain.Book;

import java.util.Collection;
import java.util.Optional;

public interface BookRepository {
    Collection<Book> findAll();
    Optional<Book> findByIsbn(String isbn);
    boolean existsByIsbn(String isbn);
    Book save(Book book);
    void deleteByIsbn(String isbn);
}
