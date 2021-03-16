package com.example.jpa.associations.Associations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController
{
    @Autowired
    private AuthorService authorService;

    @PostMapping(path = "/saveauthor")
    public void addAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }
}
