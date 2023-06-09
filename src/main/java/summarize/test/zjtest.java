package summarize.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import summarize.config.ZJConfig;
import summarize.dao.BookDaoImple;
import summarize.service.BookService;

public class zjtest {
    @Test
    public void beantest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Applicationzj.xml");
        BookService bookSevice = context.getBean("bookService", BookService.class);
        bookSevice.add();
    }

    @Test
    public void zjtestzj(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ZJConfig.class);
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.add();
    }

    @Test
    public void bookProxy(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Applicationzj.xml");
        BookDaoImple bookDaoImple = context.getBean("bookDaoImple", BookDaoImple.class);
        bookDaoImple.buy();
    }
}
