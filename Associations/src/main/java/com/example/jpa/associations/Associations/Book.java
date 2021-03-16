package com.example.jpa.associations.Associations;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "bookname")
    private String bookName;

    /*@OneToOne
    @JoinColumn(name = "author_id")
    private Author author;*/

    /*@ManyToOne bidirectional*/
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToMany(mappedBy = "book")
    private List<Author> authorList = new ArrayList<>();


 public Book() {
    }

    public Book(int id, String bookName, List<Author> authorList) {
        this.id = id;
        this.bookName = bookName;
        this.authorList = authorList;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
}
