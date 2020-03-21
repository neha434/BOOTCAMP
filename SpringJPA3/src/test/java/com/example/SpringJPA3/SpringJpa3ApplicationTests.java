package com.example.SpringJPA3;

import com.example.SpringJPA3.entities.Address;
import com.example.SpringJPA3.entities.Author;
import com.example.SpringJPA3.entities.Book;
import com.example.SpringJPA3.entities.Subject;
import com.example.SpringJPA3.entities.onetomanybi.AuthorBi;
import com.example.SpringJPA3.entities.onetomanybi.BookBi;
import com.example.SpringJPA3.entities.onetomanyuni.AuthorUni;
import com.example.SpringJPA3.entities.onetomanyuni.BookUni;
import com.example.SpringJPA3.repo.AuthorBiRepo;
import com.example.SpringJPA3.repo.AuthorRepository;
import com.example.SpringJPA3.repo.Authorunirepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class SpringJpa3ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	AuthorRepository authorRepo;

	@Autowired
	Authorunirepo authorunirepoO;

	@Autowired
	AuthorBiRepo authorBiRepo;

	//Q.4) Persist 3 subjects for each author.
	@Test
	void insertAuthor() {
		Author author = new Author();
		Address address = new Address();
		address.setLocation(" location1");
		address.setState("state1");
		address.setStreetNumber(101);
		author.setAddress(address);
		Set<Subject> subjects = new HashSet<>();
		Subject subject1 = new Subject();
		subject1.setAuthor(author);
		subject1.setName("maths");
		Subject subject2 = new Subject();
		subject2.setAuthor(author);
		subject2.setName("science");
		Subject subject3 = new Subject();
		subject3.setAuthor(author);
		subject3.setName("computer");
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		author.setSubjects(subjects);

		Book book = new Book();
		book.setAuthor(author);
		book.setBookName("My_Book");
		author.setBook(book);
		authorRepo.save(author);
	}

	//Implement One to Many Mapping between Author and Book(Unidirectional, BiDirectional and without additional table ) and implement cascade save.
	@Test
	@Transactional //Transactional annotation rolls back the transaction when the invocation finishes
	void insertAuthorUni() {
		BookUni bookuni1 = new BookUni();
		bookuni1.setName("My_Book");
		BookUni bookuni2 = new BookUni();
		bookuni2.setName("My_Book");
		Set<BookUni> bookuni12 = new HashSet<>();
		bookuni12.add(bookuni1);
		bookuni12.add(bookuni2);

		AuthorUni authoruni1 = new AuthorUni();
		authoruni1.setName("XYZ");
		authoruni1.setBookunis(bookuni12);

		authorunirepoO.save(authoruni1);
	}

	@Test
	@Transactional
	void insertAuthorBi() {
		AuthorBi authorBi = new AuthorBi();
		authorBi.setName("XYZ");
		BookBi bookBi = new BookBi();
		bookBi.setName("My_Book");
		bookBi.setAuthorBi(authorBi);
		BookBi bookBi1 = new BookBi();
		bookBi1.setName("My_Book");
		bookBi1.setAuthorBi(authorBi);
		Set<BookBi> bookBi12 = new HashSet<>();
		bookBi12.add(bookBi);
		bookBi12.add(bookBi1);
		authorBi.setBookBis(bookBi12);
		authorBiRepo.save(authorBi);
	}


}
