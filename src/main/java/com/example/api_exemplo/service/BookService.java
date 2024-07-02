package com.example.api_exemplo.service;

import com.example.api_exemplo.domain.Book;
import com.example.api_exemplo.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookClient bookClient;

    public BookService(BookClient client) {
        this.bookClient = client;
    }

    public List<Book> getBooksFromLibrary() {
        return this.bookClient.getBooks();
    }
}
