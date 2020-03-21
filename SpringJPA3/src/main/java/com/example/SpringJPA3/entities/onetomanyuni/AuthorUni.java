package com.example.SpringJPA3.entities.onetomanyuni;

import javax.persistence.*;
import java.util.Set;
//Q.7) Implement One to Many Mapping between Author and Book(Unidirectional, BiDirectional and without additional table ) and implement cascade save.
@Entity
public class AuthorUni {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "authoruni_id",referencedColumnName = "id")
    Set<BookUni> bookunis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookUni> getBookunis() {
        return bookunis;
    }

    public void setBookunis(Set<BookUni> bookunis) {
        this.bookunis = bookunis;
    }
}