package me.dongwook.springapplicationcontext;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackageClasses = DemoApplication.class)
public class ApplicationConfig {
//    @Bean
//    public BookRepository bookRepository(){
//        return new BookRepository();
//    }
//
//    @Bean BookService bookService(){
//        return new BookService();
//        //의존성주입 직접할때
////        BookService bookService = new BookService();
////        bookService.setBookRepository(bookRepository());
////        return bookService;
//    }
}
