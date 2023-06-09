package summarize.proxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class BookProxy {

//    @After(value = "execution(* summarize.dao.BookDaoImple.buy(..))")
    public void addAffter(){
        System.out.println("买东西");
    }
}
