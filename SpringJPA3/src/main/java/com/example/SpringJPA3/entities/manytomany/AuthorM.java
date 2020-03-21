package com.example.SpringJPA3.entities.manytomany;

import javax.persistence.*;
import java.util.Set;
//Q.8) Implement Many to Many Mapping between Author and Book.
@Entity
public class AuthorM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    @JoinTable(name = "author_book",joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
    Set<BookM> books;
}
