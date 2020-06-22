package me.dongwook.springapplicationcontext;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args){
//        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class); //Application을 Bean설정으로 사용
//
//        //application.xml 을 bean 설정으로 사
//        //ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        System.out.println(Arrays.toString(beanDefinitionNames));
//        BookService bookService = (BookService) context.getBean("bookService");
//        System.out.println(bookService.bookRepository != null);
    }

}
