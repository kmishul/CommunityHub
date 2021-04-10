package com.project.community_hub.controller;

import com.project.community_hub.model.Book;
import com.project.community_hub.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @PostMapping("/addbook")
    public String addBook(Book book)  {
        bookRepository.save(book);

        return "";
    }
}
