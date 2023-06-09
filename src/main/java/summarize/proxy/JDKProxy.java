package summarize.proxy;

import summarize.dao.People;
import summarize.dao.PeopleImple;

import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {People.class};

        PeopleImple people = new PeopleImple();
        People dao = (People) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new PeoplePoxy(people));
        String result = dao.eat("苹果");
        System.out.println("result"+result);
    }
}
