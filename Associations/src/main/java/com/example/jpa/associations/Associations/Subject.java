package com.example.jpa.associations.Associations;

import javax.persistence.*;

@Entity

public class Subject
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String subjectname;

    /*@ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;*/

    public Subject() {
    }

    public Subject(String subjectname) {
        this.subjectname = subjectname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }
}
