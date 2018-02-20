package com.spring.Spring5work.bootstrap;

import java.util.Iterator;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.spring.Spring5work.model.Author;
import com.spring.Spring5work.model.Book;
import com.spring.Spring5work.repositories.AuthorRepository;
import com.spring.Spring5work.repositories.BookRepository;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}




	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
		
	}
	
	
	
	
	private void initData() {	
		
		
		
		//Eric
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "12234", "Harpers Collins");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		
		//Rod
		Author rod = new Author("Rod", "johnson");
		Book noEJB = new Book("J2EE Development wihout EJB", "24668", "cal");
		rod.getBooks().add(noEJB);
		
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
		
		//John
		Author john = new Author("John", "Faber");
		Book art = new Book("Art of war", "457", "The times");
		john.getBooks().add(art);
		art.getAuthors().add(john);
		art.getAuthors().add(eric);
		art.getAuthors().add(rod);
		
		authorRepository.save(john);
		bookRepository.save(art);
		
		Author juan = new Author("Juan", "Giraldo");
		Book sociales = new Book("Sociales", "457", "New york");
		sociales.getAuthors().add(juan);
		sociales.getAuthors().add(juan);
		
		sociales.getBookSet();
		art.getBookSet();
		
				
	}

	

	
}
