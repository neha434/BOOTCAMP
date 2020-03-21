package com.example.SpringJPA3.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Q.2) Create instance variable of Address class inside Author class and save it as embedded object.
    @Embedded
    private Address address;

    //Q.3) Introduce a List of subjects for author.
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Set<Subject> subjects;

    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
