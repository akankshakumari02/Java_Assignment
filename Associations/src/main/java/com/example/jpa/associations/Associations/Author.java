package com.example.jpa.associations.Associations;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Embedded
    private Address address;


    //OneToMany mapping with Subject
    /*@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Subject> subjectSet = new ArrayList<>(); */

    //OneToOne mapping with Book
   /* @OneToOne(mappedBy = "author", cascade = CascadeType.ALL)
    private Book book; */

    //OneToMany unidirectional
    /*@OneToMany( cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private List<Book> bookList = new ArrayList<>();*/

    //OneToMany bidirectional
   @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> bookList = new ArrayList<>();

   //ManyToMany
    /*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_author",joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
   private List<Book> bookList = new ArrayList<>();*/
   public Author() {
    }

    public Author(int id, String name, Address address, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bookList = bookList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
