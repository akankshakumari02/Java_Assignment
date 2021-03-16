package com.example.jpa.associations.Associations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService
{
    @Autowired
    private AuthorRepository authorRepository;

    //to save Book and Subject details
   /* public void saveAuthor(Author author) {
        Book book = author.getBook();
        book.setAuthor(author);

        List<Subject> subjects = author.getSubjectSet();
        for (Subject subject : subjects) {
            subject.setAuthor(author);
        }
        authorRepository.save(author);
    }*/

   /* public List<Author> saveAuthor(List<Author> authors)
    {
        List<Book> books = author.getBookList();
        for(Book book : books)
        {
             book.setAuthorList(List<Author> author );
        }
        authorRepository.save(author);
    }*/

    public void saveAuthor(Author author)
    {
        authorRepository.save(author);
    }
}
