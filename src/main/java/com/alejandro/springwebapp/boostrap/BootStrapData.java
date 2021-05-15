package com.alejandro.springwebapp.boostrap;

import com.alejandro.springwebapp.domain.Author;
import com.alejandro.springwebapp.domain.Book;
import com.alejandro.springwebapp.repository.AuthorRepository;
import com.alejandro.springwebapp.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

private final AuthorRepository authorRepository;
private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("eric", "evans" );
        Book ddd= new Book("Domain Driven Design","12345");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rob","Johnson");
        Book noEJB = new Book("J2EE develoment without EJB","2313213123123");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("started in Bootstrap");
        System.out.println("numbers of books ="+bookRepository.count());


    }
}
