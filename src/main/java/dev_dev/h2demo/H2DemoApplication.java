package dev_dev.h2demo;

import dev_dev.h2demo.model.Book;
import dev_dev.h2demo.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class H2DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(H2DemoApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2DemoApplication.class, args);
		BookRepository bookRepository = configurableApplicationContext.getBean(BookRepository.class);

		Book book = new Book("Chuj", 21);
		bookRepository.save(book);

		Optional<Book> optionalBook = bookRepository.findById(1L);
		if(optionalBook.isPresent()){
			log.info(optionalBook.get()+"");
		}
	}
}
