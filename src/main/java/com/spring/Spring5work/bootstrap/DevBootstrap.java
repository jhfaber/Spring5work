package com.spring.Spring5work.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.spring.Spring5work.model.Author;
import com.spring.Spring5work.model.Book;
import com.spring.Spring5work.model.Publisher;
import com.spring.Spring5work.repositories.AuthorRepository;
import com.spring.Spring5work.repositories.BookRepository;
import com.spring.Spring5work.repositories.PublisherRepository;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;


	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}




	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
		
	}
	
	
	
	
	private void initData() {	
		
		Publisher publisher = new Publisher();
		publisher.setName("foo");
		
		publisherRepository.save(publisher);
		
		//Eric
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "12234", publisher);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		
		//Rod
		Author rod = new Author("Rod", "johnson");
		Book noEJB = new Book("J2EE Development wihout EJB", "24668", publisher);
		rod.getBooks().add(noEJB);
		
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
		
		//John
		Author john = new Author("John", "Faber");
		Book art = new Book("Art of war", "457", publisher);
		john.getBooks().add(art);
		art.getAuthors().add(john);
		art.getAuthors().add(eric);
		art.getAuthors().add(rod);
		
		authorRepository.save(john);
		bookRepository.save(art);
		
		Author juan = new Author("Juan", "Giraldo");
		Book sociales = new Book("Sociales", "457", publisher);
		sociales.getAuthors().add(juan);
		sociales.getAuthors().add(juan);
		
		sociales.getBookSet();
		art.getBookSet();
		
				
	}

	

	
}
