package com.example.SpringJPA3.entities.manytomany;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(mappedBy = "books")
    Set<AuthorM> authors;
}